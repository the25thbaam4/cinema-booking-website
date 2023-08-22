package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "hall_seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_nr", nullable = false)
    private Long id;
    private int number;
     @ManyToOne
     @JoinColumn(name = "hall_id")
     private Hall hall;


}