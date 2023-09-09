package com.redis.bookingsystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    //@JsonIgnore
    @ToString.Exclude
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    //@JsonIgnore
    @ToString.Exclude
    @OneToMany//(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservations")
    private List<Reservation> reservation;

}
