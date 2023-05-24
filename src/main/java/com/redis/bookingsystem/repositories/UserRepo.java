package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
