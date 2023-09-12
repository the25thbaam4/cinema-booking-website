package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Long>{

    List<Movie> findAllById(Long movieId);

}
