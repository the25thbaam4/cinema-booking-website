package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hall")
public class HallController {

    @Autowired
    private HallService hallService;

   @GetMapping("/{id}")
    public List<Hall> getHallDetails(@PathVariable Integer id){

       return hallService.getHallDetails(id);
   }
    @PostMapping("/set-hall")
    public ResponseEntity<Hall> saveHall(@RequestBody Hall hall){
       hallService.saveHall(hall);
       return new ResponseEntity<>(HttpStatus.CREATED);
    }
}


