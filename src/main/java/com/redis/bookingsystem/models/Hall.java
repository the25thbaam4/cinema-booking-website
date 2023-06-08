package com.redis.bookingsystem.models;

import jakarta.persistence.*;

@Entity
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_id", nullable = false)
    private Integer id;
    private int row;
    private int column;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }




}
