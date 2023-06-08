package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepo extends JpaRepository<Theater,String> {
}
