package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepo extends JpaRepository<Seat, > {
}
