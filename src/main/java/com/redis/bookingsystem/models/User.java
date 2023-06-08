package com.redis.bookingsystem.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Entity
@Table(name = "cinema_user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    private String username;
    private int age;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }




 /*   @OneToMany (mappedBy = "user")
    private Set<Reservation> reservations ;

    public long getId_nr() {
        return id_nr;
    }

    public void setId_nr(long id_nr) {
        this.id_nr = id_nr;
    }
*/


    public String getUserName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    }



