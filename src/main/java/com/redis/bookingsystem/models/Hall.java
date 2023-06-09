package com.redis.bookingsystem.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_id", nullable = false)
    private Integer id;
    private int hallRow;
    private int hallColumn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getHallRow() {
        return hallRow;
    }

    public void setHallRow(int hallRow) {
        this.hallRow = hallRow;
    }

    public int getHallColumn() {
        return hallColumn;
    }

    public void setHallColumn(int hallColumn) {
        this.hallColumn = hallColumn;
    }




}
