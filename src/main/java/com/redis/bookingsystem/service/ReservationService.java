package com.redis.bookingsystem.service;

import com.redis.bookingsystem.dtos.ReservationDTO;
import com.redis.bookingsystem.dtos.ReservationMapper;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    public Reservation saveReservation(Reservation reservation){
        reservationRepo.save(reservation);
        return reservation;
    }

    public ReservationDTO getReservationById(Long reservationId){
        Reservation reservation = reservationRepo.findById(reservationId).orElse(null);
        return ReservationMapper.convertReservationToDTO(reservation);

    }
}
