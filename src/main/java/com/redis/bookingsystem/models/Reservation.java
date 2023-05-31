package com.redis.bookingsystem.models;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_reservation", nullable = false)
    private long user_reservation;
    @ManyToOne
    private User user;
 /*   @ManyToOne
    @JoinColumn (name = "reservation_id")

  */

    public long getUser_reservation() {
        return user_reservation;
    }

    public void setUser_reservation(long user_reservation) {
        this.user_reservation = user_reservation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
