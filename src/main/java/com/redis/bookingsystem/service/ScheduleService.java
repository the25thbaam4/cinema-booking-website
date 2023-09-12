package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.models.Schedule;
import com.redis.bookingsystem.repositories.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepo scheduleRepo;

    public List<Schedule> getAllSchedules(){

        return scheduleRepo.findAll();
    }
    public List<Schedule> getScheduleDetails(Long scheduleId){
        if (scheduleId != null){
            return scheduleRepo.findAllById(scheduleId);
        }
        else {
            return scheduleRepo.findAll();
        }
    }


}
