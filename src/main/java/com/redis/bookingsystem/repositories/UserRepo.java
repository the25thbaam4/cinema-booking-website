package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findAllById(Long userId);


}
