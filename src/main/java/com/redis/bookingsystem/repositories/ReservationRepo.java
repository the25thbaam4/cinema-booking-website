package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepo extends JpaRepository <Reservation, Long> {
    List<Reservation> findReservationById(Long reservationId);
}
