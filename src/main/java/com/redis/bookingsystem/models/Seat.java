package com.redis.bookingsystem.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id", nullable = false)
    private Long id;

    @Column(name = "seat_number")
    private int seatNumber;
    private boolean isOccupied;


    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    @JsonIgnore
  //  @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

}