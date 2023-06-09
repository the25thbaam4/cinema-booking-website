package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepo extends JpaRepository <Hall,Integer>{

}

