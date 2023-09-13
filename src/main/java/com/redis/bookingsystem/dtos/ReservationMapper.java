package com.redis.bookingsystem.dtos;

import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.models.Seat;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ReservationMapper {
    private Seat seat;
    public static ReservationDTO convertReservationToDTO(Reservation reservation){
        if (reservation == null){
            return null;
        }
        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setId(reservation.getId());
        reservationDTO.setReservationNumber(reservation.getReservationNumber());


        reservationDTO.setSeats(reservation.getSeats());


        reservationDTO.setSchedule(reservation.getSchedule());
        reservationDTO.setOrder(reservation.getOrder());
        return reservationDTO;
        }

        public static Reservation convertToReservation(ReservationDTO reservationDTO){
            Reservation reservation = new Reservation();
            reservation.setId(reservationDTO.getId());
            reservation.setReservationNumber(reservationDTO.getReservationNumber());
            reservation.setSeats(reservationDTO.getSeats());
            reservation.setSchedule(reservationDTO.getSchedule());
            reservation.setOrder(reservationDTO.getOrder());
            return reservation;
        }

}
