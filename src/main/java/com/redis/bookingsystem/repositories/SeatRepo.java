package com.redis.bookingsystem.repositories;


import com.redis.bookingsystem.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepo extends JpaRepository<Seat, Long> {
    List<Seat> findAllById(Long seatId);
    Seat findSeatById(Long id);

}
