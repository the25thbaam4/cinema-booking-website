package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity @Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_reservation", nullable = false)
    private long user_reservation;
    private long reservationNumber;
    @ManyToOne
    private User user;

   @OneToMany
    private List <Seat> seatList;

}
