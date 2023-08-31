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
		@Autowired
		private OrderRepo orderRepo;

		@Autowired
		private SeatRepo seatRepo;


		private List<Schedule> scheduleList;
		private List<Seat> seatList;

		private List <Order> orderList;

		private List<Reservation> reservationList;
		@Override
		public void run(String... args) throws Exception {

			scheduleList = new ArrayList<>();
			orderList = new ArrayList<>();
			reservationList = new ArrayList<>();
			seatList = new ArrayList<>();


			var user1 = new User();
			user1.setUsername("Guy Temp");
			user1.setAge(30);
			userRepo.save(user1);

			var movie = new Movie();
			movie.setName("arielle");
			movie.setYearOfRelease(2020);
			movie.setSchedules(scheduleList);
			movieRepo.save(movie);


			var hall1 = new Hall();
			hall1.setHallName("animation");
			hallRepo.save(hall1);

			var seat1 = new Seat();
			seat1.setSeatNumber(4);
			seat1.setHall(hall1);
			seatRepo.save(seat1);

			var seat2 = new Seat();
			seat2.setSeatNumber(5);
			seat2.setHall(hall1);
			seatRepo.save(seat2);

			seatList.add(seat1);
			seatList.add(seat2);

			hall1.setSeats(seatList);
			hallRepo.save(hall1);



			var schedule2 = new Schedule();
			schedule2.setMovie(movie);
			schedule2.setPlayingTime(LocalDateTime.of(2023,9,5,19,00));
			schedule2.setHall(hall1);
			scheduleRepo.save(schedule2);

			var schedule1 = new Schedule();
			schedule1.setMovie(movie);
			schedule1.setPlayingTime(LocalDateTime.of(2023,8,29,21,00));
			schedule1.setHall(hall1);
			scheduleRepo.save(schedule1);


			scheduleList.add(schedule2);
			scheduleList.add(schedule1);

			var reservation1 = new Reservation();
			reservation1.setSchedule(schedule1);
			reservation1.setSeatList(seatList);

			reservationRepo.save(reservation1);
			reservationList.add(reservation1);

			var order1 = new Order();
			order1.setUser(user1);
			order1.setReservation(reservationList);

			orderRepo.save(order1);


		}

	}
}


