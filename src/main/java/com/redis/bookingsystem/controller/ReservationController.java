package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.repositories.ReservationRepo;
import com.redis.bookingsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

        @GetMapping("/{id}")
        public List<Reservation> getReservationById(@PathVariable("id") Long id ){
            return reservationService.getReservationDetails(id);
        }

        @PostMapping("/set-reservation")
        public ResponseEntity<Reservation> saveReservation(@RequestBody Reservation reservation){
            reservationService.saveReservation(reservation);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
}
