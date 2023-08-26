package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity @Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    private long id;
    private long orderNumber;

    @OneToMany
    @JoinColumn(name = "reservation_id")
    private List<Reservation> reservation;

    @ManyToOne
    private User user;

}
