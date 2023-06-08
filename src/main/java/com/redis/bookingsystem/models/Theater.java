package com.redis.bookingsystem.models;

import jakarta.persistence.*;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "theater_name", nullable = false)
    private String name;
    private String address;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
