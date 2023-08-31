package com.redis.bookingsystem.service;

import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void saveUser (User user){
        userRepo.save(user);
    }

    public List<User> getUserDetails(Long userId){
        if (userId != null){
            return userRepo.findAllById(userId);
        }
        else {
            return userRepo.findAll();
        }
    }

    public void deleteUser(Long userId){
        userRepo.deleteById(userId);
    }
}
