package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_id", nullable = false)
    private Long id;

    @Column(name = "seat_number")
    private int seatNumber;


     @ToString.Exclude
     @ManyToOne
     @JoinColumn(name = "hall_id")
     private Hall hall;

     @ToString.Exclude
     @ManyToOne
     @JoinColumn(name = "reservation_id")
     private Reservation reservation;

/*
    @AssertTrue(message = "column number must be between 1 and 10")
    public boolean isValidRowNumber() {
        return seatColumn >= 0 && seatColumn <= 10;
    }

*/
}