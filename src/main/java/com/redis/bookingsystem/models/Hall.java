package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_id", nullable = false)
    private int id;

    private String hallName;

    @ToString.Exclude
    @OneToMany(mappedBy = "hall")
    private List<Seat> seats;

    @ToString.Exclude
    @OneToMany(mappedBy = "hall")
    private List<Schedule> schedules;



}
