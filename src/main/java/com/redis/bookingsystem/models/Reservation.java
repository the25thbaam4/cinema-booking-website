package com.redis.bookingsystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;


@Entity @Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservation_id", nullable = false)
    private Long id;

    //@UniqueElements
    private long reservationNumber;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    //@JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "reservation")
    //@JoinColumn(name = "seat_id")
    private List <Seat> seats;

   // @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

}
