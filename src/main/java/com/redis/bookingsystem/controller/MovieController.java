package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

@Autowired
private MovieService movieService;


    @GetMapping("/{id}")
    public List<Movie> getMovieById(@PathVariable("id") Long id)
    {
        return movieService.getMovieDetails(id);
    }






}
