package com.redis.bookingsystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.redis.bookingsystem.models.Schedule;

public interface ScheduleRepo extends JpaRepository <Schedule, Long> {
}
