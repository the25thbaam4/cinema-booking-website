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
		private OrderRepo orderRepo;
		//@Autowired
		private List<Seat> seats;

		private List <Order> orders;
		@Override
		public void run(String... args) throws Exception {
			schedules = new ArrayList<>();
			orders = new ArrayList<>();
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


			var hall1 = new Hall();
			hall1.setHallname("action");
			hallRepo.save(hall1);


			var hall2 = new Hall();
			hall2.setHallname("comedy");
			hallRepo.save(hall2);

			var seat1 = new Seat();
			seat1.setSeatRow(12);

			var seat2 = new Seat();
			seat2.setSeatRow(94);

			seats = new ArrayList<>();
			seats.add(seat1);

			hall2.getSeats().add(seat1);


			var order1 = new Order();

			order1.setReservation(reservation);
			orders.add(order1);



		}

	}
}


