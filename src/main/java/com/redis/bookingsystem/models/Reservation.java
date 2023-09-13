package com.redis.bookingsystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Entity @Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservation_id", nullable = false)
    private Long id;


    private long reservationNumber;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @JsonIgnore
    @OneToMany(mappedBy = "reservation")
    private List <Seat> seats;


    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

}
