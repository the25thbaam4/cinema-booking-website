package com.redis.bookingsystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redis.bookingsystem.models.Movies;
public interface MovieRepository extends JpaRepository<Movies, Long>{
}
