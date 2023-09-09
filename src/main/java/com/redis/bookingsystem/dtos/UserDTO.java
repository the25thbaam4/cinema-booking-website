package com.redis.bookingsystem.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private long id;
    private int age;
    private String username;
}
