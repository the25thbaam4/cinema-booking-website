package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepo scheduleRepo;

    public void saveSchedule(Schedule schedule){
        scheduleRepo.save(schedule);
    }

    public List<Schedule> getScheduleDetails(Long scheduleId){
        if (scheduleId != null){
            return scheduleRepo.findAllById(scheduleId);
        }
        else {
            return scheduleRepo.findAll();
        }
    }

    public void deleteSchedule(Long scheduleId){
        scheduleRepo.deleteById(scheduleId);
    }

}
