package com.redis.bookingsystem.controller;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.redis.bookingsystem.dtos.ReservationDTO;
import com.redis.bookingsystem.dtos.ReservationMapper;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

        @GetMapping("/{id}")
        public ResponseEntity<ReservationDTO> getReservationById(@PathVariable("id") Long id ){
            ReservationDTO reservationDTO = reservationService.getReservationById(id);
            if (reservationDTO != null){
                return new ResponseEntity<>(reservationDTO, HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        }

        @PostMapping("/set-reservation")
        public ResponseEntity<ReservationDTO> saveReservation(@RequestBody ReservationDTO reservationDTO){
            Reservation reservation = ReservationMapper.convertToReservation(reservationDTO);
            Reservation createdReservation = reservationService.saveReservation(reservation);
            ReservationDTO createdReservationDTO = ReservationMapper.convertReservationToDTO(createdReservation);
            return new ResponseEntity<>(createdReservationDTO, HttpStatus.CREATED);
        }
}
