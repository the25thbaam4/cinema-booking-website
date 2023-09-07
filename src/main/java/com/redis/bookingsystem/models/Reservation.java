package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Entity @Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_reservation", nullable = false)
    private Long id;
    private long reservationNumber;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat")
    private List <Seat> seatList;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

}
