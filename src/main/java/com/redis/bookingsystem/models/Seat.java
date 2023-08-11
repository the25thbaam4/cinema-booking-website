package com.redis.bookingsystem.models;

<<<<<<< HEAD

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "hall_seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_nr", nullable = false)
    private Long id;
    private int number;
  // @ManyToOne
   // private Hall hall;


=======
public class Seat {
}
>>>>>>> parent of 2b141a1 (updated)
