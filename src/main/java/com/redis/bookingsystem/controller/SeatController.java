package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Seat;
import com.redis.bookingsystem.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/seat")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping
    public List<Seat> getAllSeats(){
        return seatService.getAllSeats();
    }

    @GetMapping("/{id}")
    public List<Seat> getSeat(@PathVariable Long id){
        return seatService.getSeatDetails(id);
    }


}
