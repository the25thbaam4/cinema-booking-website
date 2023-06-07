package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.repositories.MovieRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;


    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long id)
    {
        var movie = movieRepository.findById(id);
        return ResponseEntity.of(movie);
    }

    @GetMapping
    @ResponseBody
    public List<Movie> getAllMovies(){

        return movieRepository.findAll();
    }



}
