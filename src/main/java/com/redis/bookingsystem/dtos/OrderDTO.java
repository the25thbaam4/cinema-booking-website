package com.redis.bookingsystem.dtos;

import com.redis.bookingsystem.models.Reservation;
import com.redis.bookingsystem.models.User;
import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private long id;
    private User user;
    private List<Reservation> reservations;
}
