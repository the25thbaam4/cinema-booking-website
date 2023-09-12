package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.models.Seat;
import com.redis.bookingsystem.repositories.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepo seatRepo;



    public List<Seat> getSeatDetails( Long seatId){
        if (seatId != null){
            return seatRepo.findAllById(seatId);
        }
        return seatRepo.findAll();
    }

    public boolean isSeatAlreadyReserved(Long seatId) {
        Seat seat = seatRepo.findSeatById(seatId);

        return seat.getReservation() != null;
    }

    public List<Seat> getAllSeats(){

        return seatRepo.findAll();
    }

}


