/*package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity @Data
@Table(name = "cinema_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
*/