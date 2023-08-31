package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import com.redis.bookingsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
