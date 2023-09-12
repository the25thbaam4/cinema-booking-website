package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.models.Seat;
import com.redis.bookingsystem.repositories.HallRepo;
import com.redis.bookingsystem.repositories.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HallService {
    @Autowired
    private HallRepo hallRepo;
    @Autowired
    private SeatRepo seatRepo;

   public void initHallsWithSeats(){
     //  List<String> hallNames = Arrays.asList(, "Comedy", "Romance", "Horror", "Sci-Fi");
       Map<Integer, String> hallNames = new HashMap<>();
       hallNames.put(1, "Action");
       hallNames.put(2, "Comedy");
       hallNames.put(3, "Horror");
       hallNames.put(4, "Romance");
       hallNames.put(5, "Sci-Fi");

       for (int hallNumber = 1; hallNumber <= 5; hallNumber++){
           Hall hall = new Hall();
           String hallName = hallNames.getOrDefault(hallNumber, "Unknown");
           hall.setHallName(hallName);
           hallRepo.save(hall);

           for (int seatNumber = 1; seatNumber <= 10; seatNumber++){
               Seat seat = new Seat();
               seat.setSeatNumber(seatNumber);
               seat.setHall(hall);
               seatRepo.save(seat);
           }
       }

   }

    public List<Hall> getHallDetails(){

        return hallRepo.findAll();
    }


}
