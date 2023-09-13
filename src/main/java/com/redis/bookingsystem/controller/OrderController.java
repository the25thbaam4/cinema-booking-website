package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.dtos.OrderDTO;
import com.redis.bookingsystem.dtos.OrderMapper;
import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;



    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id) {
        OrderDTO orderDTO = orderService.getOrderById(id);

        if (orderDTO != null) {
            return new ResponseEntity<>(orderDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }

    }
        @PostMapping("/create")
        public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO){
            Order order = OrderMapper.convertToOrder(orderDTO);

            Order createdOrder = orderService.createOrder(order);

            OrderDTO createdOrderDTO = OrderMapper.convertToOrderDTO(createdOrder);

            return new ResponseEntity<>(createdOrderDTO, HttpStatus.CREATED);
        }


/*
    @GetMapping("/{id}")
    public List<Order> getOrderById(@PathVariable("id") Long id ){
        return orderService.getOrderDetails(id);
    }

    @PostMapping("/set-order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



 */
}
