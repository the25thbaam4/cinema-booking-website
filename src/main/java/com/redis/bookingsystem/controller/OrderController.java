package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/set-order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
