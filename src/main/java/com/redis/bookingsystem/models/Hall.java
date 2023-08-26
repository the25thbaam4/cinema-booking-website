package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_id", nullable = false)
    private int id;

    private String hallName;

    @OneToMany
    @JoinColumn(name = "seat_id")
    private List<Seat> seats;

    @OneToMany
    @JoinColumn(name = "timetable_id")
    private List<Schedule> schedules;



}
