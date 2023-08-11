package com.redis.bookingsystem.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Movie {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "movie_id", nullable = false)
        private Long id;

        private String name;
        private Integer yearOfRelease;

  /* @ManyToOne
    private List<Schedule> schedules;

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
*/

    }

