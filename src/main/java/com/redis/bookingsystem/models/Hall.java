package com.redis.bookingsystem.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_id", nullable = false)
    private Integer id;

    @OneToMany
    private List<Seat> seats = new ArrayList<>();



}
