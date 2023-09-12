package com.redis.bookingsystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity @Data
@RequiredArgsConstructor
public class Movie {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "movie_id", nullable = false)
        private Long id;

        @NonNull
        private String name;
        @NonNull
        private int yearOfRelease;

        @JsonIgnore
        @ToString.Exclude
        @OneToMany(mappedBy = "movie")
        private List<Schedule> schedules;

    }