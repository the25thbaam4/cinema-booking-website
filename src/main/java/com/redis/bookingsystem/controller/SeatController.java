package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Seat;
import com.redis.bookingsystem.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {

    @Autowired
    private SeatService seatService;



    @GetMapping("/{id}")
    public List<Seat> getSeat(@PathVariable Long id){
        return seatService.getSeatDetails(id);
    }


    @PostMapping("/set-seat")
    public ResponseEntity<Seat> saveSeat(@RequestBody Seat seat) {
        seatService.saveSeat(seat);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
