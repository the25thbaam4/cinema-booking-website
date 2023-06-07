package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.Movies;
import com.redis.bookingsystem.repositories.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;


    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movie/{movie}")
    @ResponseBody
    public Movies getMovies(){
        var movie = n
    }


}
