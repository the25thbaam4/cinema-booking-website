package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import lombok.Data;

@Entity
@Data
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_id", nullable = false)
    private Long id;
    @Column(name = "row_number")
    private int seatRow;
    @Column(name = "seat_column")
    private String seatColumn;

     @ManyToOne
     @JoinColumn(name = "hall_id")
     private Hall hall;

     @ManyToOne
    private Reservation reservation;


    @AssertTrue(message = "Row number must be between 1 and 10")
    public boolean isValidRowNumber() {
        return seatRow >= 1 && seatRow <= 10;
    }

    // Custom validation logic for seat columns (a to h)
    @AssertTrue(message = "Seat column must be between 'a' and 'h'")
    public boolean isValidSeatColumn() {
        return seatColumn != null && seatColumn.matches("[a-hA-H]");
    }

}