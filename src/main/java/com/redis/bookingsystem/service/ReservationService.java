package com.redis.bookingsystem.service;

import com.redis.bookingsystem.dtos.ReservationDTO;
import com.redis.bookingsystem.dtos.ReservationMapper;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.models.Seat;
import com.redis.bookingsystem.repositories.ReservationRepo;
import com.redis.bookingsystem.repositories.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private SeatService seatService;

    @Autowired
    private SeatRepo seatRepo;

   /* public Reservation saveReservation(Reservation reservation){
       List<Long> reservedSeatIDs = new ArrayList<>();

        for (Long seatId : reservedSeatIDs){
            if (seatService.isSeatAlreadyReserved(seatId))
                reservedSeatIDs.add(seatId);
        }

        for (Long seat: reservedSeatIDs) {
            Seat reservedSeat = new Seat();
            reservedSeat.setId(seat);
            seatRepo.save(reservedSeat);

            seatRepo.getReferenceById(seat);
            reservation.setSeats(Arrays.asList(reservedSeat));
        }



        reservationRepo.save(reservation);
        return reservation;
    }

    */

    public Reservation saveReservation(Reservation reservation, List<Long> reservedSeatIDs) {
        List<Seat> reservedSeats = new ArrayList<>();

        for (Long seatId : reservedSeatIDs) {
            Seat seat = seatRepo.findById(seatId).orElse(null);
            if (seat != null && !seat.isOccupied()) {
                seat.setOccupied(true);
                seat.setReservation(reservation);
                reservedSeats.add(seat);
            }
        }

        reservation.setSeats(reservedSeats);
        reservationRepo.save(reservation);

        return reservation;
    }


    public ReservationDTO getReservationById(Long reservationId){
        Reservation reservation = reservationRepo.findById(reservationId).orElse(null);
        return ReservationMapper.convertReservationToDTO(reservation);

    }
}
