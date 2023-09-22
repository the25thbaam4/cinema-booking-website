package com.redis.bookingsystem.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private long id;

    private String hallName;

   // @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "hall")
    private List<Seat> seats;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "hall")
    private List<Schedule> schedules;



}
