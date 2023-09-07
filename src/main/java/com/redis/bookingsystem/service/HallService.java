package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.Hall;
import com.redis.bookingsystem.repositories.HallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HallService {
    @Autowired
    private HallRepo hallRepo;

    public void saveHall(Hall hall){
        hallRepo.save(hall);
    }

    public List<Hall> getHallDetails(Integer hallId){
        if (hallId != null){
            return hallRepo.findAllById(hallId);
        }
        return hallRepo.findAll();
    }
    public void deleteHall(Integer hallId){
        hallRepo.deleteById(hallId);
    }

}