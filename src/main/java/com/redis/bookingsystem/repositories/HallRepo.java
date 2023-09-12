package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HallRepo extends JpaRepository <Hall,Long>{
    List<Hall> findAllById(Long hallId);
}

