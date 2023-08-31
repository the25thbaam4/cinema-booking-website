package com.redis.bookingsystem.repositories;
import com.redis.bookingsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redis.bookingsystem.models.Schedule;

import java.util.List;

public interface ScheduleRepo extends JpaRepository <Schedule, Long> {
    List<Schedule> findAllById(Long scheduleId);

}
