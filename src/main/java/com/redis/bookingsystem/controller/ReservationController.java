package com.redis.bookingsystem.controller;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
