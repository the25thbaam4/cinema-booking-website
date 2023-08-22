package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity @Getter
public class Movie {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "movie_id", nullable = false)
        private Long id;

        public void setName(String name) {
                this.name = name;
        }

        public void setYearOfRelease(Integer yearOfRelease) {
                this.yearOfRelease = yearOfRelease;
        }

        private String name;
        private Integer yearOfRelease;

   @OneToMany
    private List<Schedule> schedules;

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }


    }

