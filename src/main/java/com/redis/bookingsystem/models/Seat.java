package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_id", nullable = false)
    private Long id;
    private int seatNumber;
     @ManyToOne
     @JoinColumn(name = "hall_id")
     private Hall hall;

     @ManyToOne
    private Reservation reservation;

}