package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity @Data
public class Movie {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "movie_id", nullable = false)
        private Long id;

        private String name;
        private Integer yearOfRelease;

        @OneToMany(mappedBy = "movie")
        private List<Schedule> schedules;



    }

