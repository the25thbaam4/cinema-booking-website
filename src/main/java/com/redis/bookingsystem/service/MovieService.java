package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public void saveMovie(Movie movie){
        movieRepo.save(movie);
    }

    public List<Movie> getMovieDetails(Long movieId){
        if (movieId != null){
            return movieRepo.findAllById(movieId);
        }
        return movieRepo.findAll();
    }
    public void deleteMovie(Long movieId){
        movieRepo.deleteById(movieId);
    }


}
