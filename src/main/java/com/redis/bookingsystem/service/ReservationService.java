package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    public void saveReservation(Reservation reservation){
        reservationRepo.save(reservation);
    }

    public List<Reservation> getReservationDetails(Long id){
        if (id != null){
            return reservationRepo.findReservationById(id);
        }
       return reservationRepo.findAll();
    }
}
