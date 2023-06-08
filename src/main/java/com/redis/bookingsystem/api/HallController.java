package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.repositories.HallRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/halls")
public class HallController {

    private final HallRepo hallRepo;

    public HallController(HallRepo repo){
        this.hallRepo = repo;
    }

   @GetMapping("/{id}")
    public ResponseEntity<Hall> getHallById(@PathVariable("id") Integer id){
      var hall = hallRepo.findById(id);
        return ResponseEntity.of(hall);
    }
    @GetMapping
    public List<Hall> getAllHall(){
        return hallRepo.findAll();
    }


}
