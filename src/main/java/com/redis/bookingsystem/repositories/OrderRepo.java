package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findAllById(Long orderId);

}
