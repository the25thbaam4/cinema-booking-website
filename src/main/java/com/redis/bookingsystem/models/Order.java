package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Entity @Data
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    private long id;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservations")
    private List<Reservation> reservation;

}
