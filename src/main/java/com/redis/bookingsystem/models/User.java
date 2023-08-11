package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity @Getter @Setter @ToString
@Table(name = "cinema_user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long id;

    private String username;
    private int age;
    //private Order order;


    }



