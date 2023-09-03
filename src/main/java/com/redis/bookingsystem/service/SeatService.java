package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private OrderRepo orderRepo;

    public void saveOrder(Order order){
        orderRepo.save(order);
    }

    public List<Order> getOrderDetails(Long orderId){
        if (orderId != null){
            return orderRepo.findAllById(orderId);
        }
        return orderRepo.findAll();
    }
    public void deleteMovie(Long movieId){
        orderRepo.deleteById(movieId);
    }

}
