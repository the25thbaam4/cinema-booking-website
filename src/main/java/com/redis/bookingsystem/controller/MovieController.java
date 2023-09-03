package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.repositories.MovieRepo;
import com.redis.bookingsystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

@Autowired
private MovieService movieService;


    @GetMapping("/{id}")
    public List<Movie> getMovieById(@PathVariable("id") Long id)
    {
        return movieService.getMovieDetails(id);
    }

    @PostMapping("/set-movie")
    public ResponseEntity<Movie> saveUser(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }




}
