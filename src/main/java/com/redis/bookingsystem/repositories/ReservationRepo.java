package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository <Reservation, Long> {
}
