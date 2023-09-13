package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.models.Movie;
import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.repositories.HallRepo;
import com.redis.bookingsystem.repositories.MovieRepo;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private ScheduleRepo scheduleRepo;

    @Autowired
    private HallRepo hallRepo;


    public void initializeMoviesWithSchedules() {

        List<Movie> movies = Arrays.asList(
                new Movie("John Wick", 2014),
                new Movie("Anchorman: The Legend of Ron Burgundy", 2004),
                new Movie("The Exorcist", 1973),
                new Movie("My Big Fat Greek Wedding ", 2002),
                new Movie("2001: A Space Odyssey ", 1968)
        );

        List<Schedule> schedules = new ArrayList<>();
        long hallNumber = 0;
        for (Movie movie : movies) {
            Schedule schedule1 = new Schedule(LocalDateTime.of(2023, 10, 15, 15, 0));
            schedule1.setMovie(movie);

            schedule1.setHall(hallRepo.getReferenceById(1 + hallNumber));
            schedules.add(schedule1);

            Schedule schedule2 = new Schedule(LocalDateTime.of(2023, 10, 15, 18, 0));
            schedule2.setMovie(movie);
            schedule2.setHall(hallRepo.getReferenceById(1 + hallNumber));

            schedules.add(schedule2);
            hallNumber++;
        }


        movieRepo.saveAll(movies);
        scheduleRepo.saveAll(schedules);

    }


    public List<Movie> getMovieDetails(Long movieId) {
        if (movieId != null) {
            return movieRepo.findAllById(movieId);
        }
        return movieRepo.findAll();
    }

    public List<Movie> getAllMovies(){

        return movieRepo.findAll();
    }


}
