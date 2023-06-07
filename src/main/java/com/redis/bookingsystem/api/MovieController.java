package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.Movies;
import com.redis.bookingsystem.repositories.MovieRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;


    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movie/{id}")
    @ResponseBody
    public ResponseEntity<Movies> getMovieById(@PathVariable("id") Long id)
    {
        var movie = movieRepository.findById(id);
        return ResponseEntity.of(movie);

    }




}
