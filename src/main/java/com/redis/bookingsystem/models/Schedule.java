package com.redis.bookingsystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schedule_id", nullable = false)
    private Long id;
    @NonNull
    private LocalDateTime playingTime;

   // @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "schedule")
    //@JoinColumn(name = "reservation_id")
    private List<Reservation> reservation;

  //  @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

}