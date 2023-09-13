package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.dtos.ReservationDTO;
import com.redis.bookingsystem.dtos.ReservationMapper;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.models.Seat;
import com.redis.bookingsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
   // @Autowired
    private Seat seat;

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
            List<Long> reservedSeatIDs = reservationDTO.getSeats().stream()
                    .map(Seat::getId)
                    .collect(Collectors.toList());
            Reservation createdReservation = reservationService.saveReservation(reservation, reservedSeatIDs);
            ReservationDTO createdReservationDTO = ReservationMapper.convertReservationToDTO(createdReservation);
            return new ResponseEntity<>(createdReservationDTO, HttpStatus.CREATED);
        }
}
