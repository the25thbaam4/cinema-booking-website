package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import com.redis.bookingsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;



    @GetMapping("/{id}")
    public List<Schedule> getSchedule(@PathVariable Long id){
        return scheduleService.getScheduleDetails(id);
    }


    @PostMapping("/set-schedule")
    public ResponseEntity<Schedule> saveUser(@RequestBody Schedule schedule) {
        scheduleService.saveSchedule(schedule);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
