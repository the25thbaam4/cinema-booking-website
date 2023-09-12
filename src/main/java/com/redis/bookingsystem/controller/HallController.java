package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hall")
public class HallController {

    @Autowired
    private HallService hallService;

   @GetMapping
    public List<Hall> getAllHalls(){
       return hallService.getHallDetails();
   }


}


