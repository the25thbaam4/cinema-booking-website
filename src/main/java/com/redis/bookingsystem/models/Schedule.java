package com.redis.bookingsystem.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schedule_id", nullable = false)
    private Long id;
    private LocalDateTime playingTime;
    private Movie movie;
   // private Hall hall;


}