package com.redis.bookingsystem.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false) private Long id;

    @OneToOne()
    private Movies movie;

    private LocalDateTime playingTime;

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public LocalDateTime getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(LocalDateTime playingTime) {
        this.playingTime = playingTime;
    }
}