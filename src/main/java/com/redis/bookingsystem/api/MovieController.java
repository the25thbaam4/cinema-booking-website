package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.repositories.MovieRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepo movieRepo;


    public MovieController(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long id)
    {
        var movie = movieRepo.findById(id);
        return ResponseEntity.of(movie);
    }

    @GetMapping
    @ResponseBody
    public List<Movie> getAllMovies(){

        return movieRepo.findAll();
    }



}
