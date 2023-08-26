package com.redis.bookingsystem;

import com.redis.bookingsystem.models.*;
import com.redis.bookingsystem.repositories.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.redis.bookingsystem.models.User;


@SpringBootApplication
public class BookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemApplication.class, args);
	}

	@Component
	class DummyDataGenerator implements CommandLineRunner {



		private List<Schedule> schedules;
		@Autowired
		private MovieRepo movieRepo;

		@Autowired
		private ScheduleRepo scheduleRepo;
		@Autowired
		private UserRepo userRepo;
		@Autowired
		private ReservationRepo reservationRepo;


		@Autowired
		private HallRepo hallRepo;
		//@Autowired
		private OrderRepo orderRepo;
		//@Autowired
		private List<Seat> seats;

		private List <Order> orders;
		@Override
		public void run(String... args) throws Exception {

			var user1 = new User();
			user1.setUsername("Guy Temp");
			user1.setAge(30);
			userRepo.save(user1);

			var movie = new Movie();
			movie.setName("arielle");
			movie.setYearOfRelease(2020);
			movie.setSchedules(schedules);
			movieRepo.save(movie);



			var hall1 = new Hall();
			hall1.setHallName("animation");
			hallRepo.save(hall1);

			var order1 = new Order();
			order1.setUser(user1);


			var schedule2 = new Schedule();
			schedule2.setMovie(movie);
			schedule2.setPlayingTime(LocalDateTime.of(2023,9,5,19,00));
			schedule2.setHall(hall1);
			scheduleRepo.save(schedule2);


			schedules = new ArrayList<>();
			orders = new ArrayList<>();
			schedules.add(schedule2);

		}

	}
}


