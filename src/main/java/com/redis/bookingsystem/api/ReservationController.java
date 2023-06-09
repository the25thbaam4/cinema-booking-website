package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.repositories.ReservationRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reservations")
public class ReservationController {
    private ReservationRepo reservationRepo;

        public ReservationController(ReservationRepo reservationRepo){
            this.reservationRepo = reservationRepo;
        }
        @GetMapping("id")
        public ResponseEntity<Reservation> getReservationById(@PathVariable("id") Long id){
            var reservation = reservationRepo.findById(id);
            return ResponseEntity.of(reservation);
        }

        @GetMapping
        public List<Reservation> getAllReservations(){
            return reservationRepo.findAll();
        }

}
