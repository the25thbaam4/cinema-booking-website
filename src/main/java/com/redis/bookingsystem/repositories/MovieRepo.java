package com.redis.bookingsystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redis.bookingsystem.models.Movie;
public interface MovieRepo extends JpaRepository<Movie, Long>{

}
