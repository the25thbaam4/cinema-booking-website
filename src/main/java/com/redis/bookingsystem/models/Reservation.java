package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity @Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_reservation", nullable = false)
    private long user_reservation;
    @ManyToOne
    private User user;

   // private Order order;

}
