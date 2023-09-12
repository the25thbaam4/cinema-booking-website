package com.redis.bookingsystem.dtos;

import com.redis.bookingsystem.models.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private long id;
    private int age;
    private String username;
    private List<Order> orders;
}
