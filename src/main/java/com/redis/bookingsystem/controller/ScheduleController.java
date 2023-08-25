package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    private ScheduleRepo scheduleRepo;
    public ScheduleController(ScheduleRepo scheduleRepo){
        this.scheduleRepo = scheduleRepo;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getScheduleById(@PathVariable("/id") Long id){
        var schedule = scheduleRepo.findById(id);
        return ResponseEntity.of(schedule);
    }

    @GetMapping
    public List<Schedule> getAllSchedule(){
        return scheduleRepo.findAll();
    }
}
