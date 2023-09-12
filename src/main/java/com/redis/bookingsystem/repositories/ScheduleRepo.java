package com.redis.bookingsystem.repositories;

import com.redis.bookingsystem.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepo extends JpaRepository <Schedule, Long> {
    List<Schedule> findAllById(Long scheduleId);

}
