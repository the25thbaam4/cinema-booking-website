package com.redis.bookingsystem.dtos;

import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.models.Seat;
import lombok.Data;

import java.util.List;

@Data
public class ReservationDTO {
    private Long id;
    private Long reservationNumber;
    private List<Seat> seats;
    private Schedule schedule;
    private Order order;

}
