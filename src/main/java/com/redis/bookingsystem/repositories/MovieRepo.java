package com.redis.bookingsystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redis.bookingsystem.models.Movie;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Long>{

    List<Movie> findAllById(Long movieId);

}
