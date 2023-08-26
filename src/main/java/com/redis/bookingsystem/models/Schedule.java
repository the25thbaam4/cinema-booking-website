package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data

public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schedule_id", nullable = false)
    private Long id;

    private LocalDateTime playingTime;


    @ManyToOne
    private Movie movie;

    @OneToMany
    @JoinColumn(name = "reservation_id")
    private List<Reservation> reservation;

    @ManyToOne
    private Hall hall;

}