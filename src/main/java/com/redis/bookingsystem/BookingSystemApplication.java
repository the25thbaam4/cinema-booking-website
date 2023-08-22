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
		private MovieRepo repository;

		@Autowired
		private ScheduleRepo scheduleRepo;
		@Autowired
		private UserRepo userRepo;
		@Autowired
		private ReservationRepo reservationRepo;


		@Autowired
		private HallRepo hallRepo;
		//@Autowired
		//private OrderRepo orderRepo;


		@Override
		public void run(String... args) throws Exception {
			schedules = new ArrayList<>();
			var movie = new Movie();
			movie.setName("arielle");
			movie.setYearOfRelease(2020);
			repository.save(movie);
			var movie2 = new Movie();
			movie2.setName("supermann");
			movie2.setYearOfRelease(2010);
			repository.save(movie2);
			var schedule = new Schedule();
			schedule.setMovie(movie2);
			schedule.setPlayingTime(LocalDateTime.now());
			scheduleRepo.save(schedule);
			var schedule2 = new Schedule();
			schedule2.setMovie(movie);
			schedule2.setPlayingTime(LocalDateTime.now());
			scheduleRepo.save(schedule2);

			var user1 = new User();
			user1.setUsername("Guy Temp");
			user1.setAge(30);
			userRepo.save(user1);


			schedules.add(schedule);
			schedules.add(schedule2);
			var reservation = new Reservation();
			reservation.setUser(user1);
			reservation.setUser_reservation(202305);
			reservationRepo.save(reservation);


			var movie3 = new Movie();

			movie3.setYearOfRelease(2012);
			movie3.setName("some movie");
			repository.save(movie3);

			var user2 = new User();
			user2.setUsername("another guy");
			user2.setAge(29);
			userRepo.save(user2);


			/*var hall1 = new Hall();

			hallRepo.save(hall1);


			var hall2 = new Hall();

			hallRepo.save(hall2);

<<<<<<< HEAD
			var order1 = new Order();
			order1.setUser(user1);
			order1.setReservation(reservation);
			orderRepo.save(order1);
				*/



		}

	}
}


