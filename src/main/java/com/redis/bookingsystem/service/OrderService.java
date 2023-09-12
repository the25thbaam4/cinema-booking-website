package com.redis.bookingsystem.service;

import com.redis.bookingsystem.dtos.OrderDTO;
import com.redis.bookingsystem.dtos.OrderMapper;
import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    //@Autowired
   // private OrderMapper orderMapper;

    public Order createOrder(Order order){

       return orderRepo.save(order);
    }

    public OrderDTO getOrderById(Long orderId){
        Order order = orderRepo.findById(orderId).orElse(null);
        return OrderMapper.convertToOrderDTO(order);
    }

  /*  public List<Order> getOrderDetails(Long orderId){
        if (orderId != null){
            return orderRepo.findAllById(orderId);
        }
        return orderRepo.findAll();
    }
    public void deleteOrder(Long orderId){
        orderRepo.deleteById(orderId);
    }


   */
}
