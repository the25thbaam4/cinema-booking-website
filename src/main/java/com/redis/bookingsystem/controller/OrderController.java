package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/{id}")
    public List<Order> getOrderById(@PathVariable("id") Long id ){
        return orderService.getOrderDetails(id);
    }

    @PostMapping("/set-order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
