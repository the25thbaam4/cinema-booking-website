package com.redis.bookingsystem;

import com.redis.bookingsystem.repositories.MovieRepository;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.redis.bookingsystem.models.Movies;
import com.redis.bookingsystem.models.Schedule;


@SpringBootApplication
public class BookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemApplication.class, args);
	}
	@Component
	class DummyDataGenerator implements CommandLineRunner {

		@Autowired
		private MovieRepository repository;

		@Autowired
		private ScheduleRepo scheduleRepo;

		@Override public void run(String... args) throws Exception {
			var movie = new Movies();
			movie.setName("arielle");
			repository.save(movie);
			var movie2 = new Movies();
			movie2.setName("supermann");
			movie2.setYearOfRelease(2010);
			repository.save(movie2);
			var schedule = new Schedule();
			schedule.setMovie(movie2);
			schedule.setPlayingTime(LocalDateTime.now());
			scheduleRepo.save(schedule);

		}
	}

}
