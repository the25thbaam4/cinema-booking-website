package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;



    @GetMapping("/{id}")
    public List<Schedule> getSchedule(@PathVariable Long id){
        return scheduleService.getScheduleDetails(id);
    }

    @GetMapping
    public List<Schedule> getAllSchedules(){
       return scheduleService.getAllSchedules();
    }

}
