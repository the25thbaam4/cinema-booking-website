package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Entity @Data
@Table(name = "cinema_user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long id;

    private String username;
    private int age;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;





    }



