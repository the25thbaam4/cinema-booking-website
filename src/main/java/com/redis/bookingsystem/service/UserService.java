package com.redis.bookingsystem.service;

import com.redis.bookingsystem.dtos.UserDTO;
import com.redis.bookingsystem.dtos.UserMapper;
import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public UserDTO getUserById(Long userId){
        User user = userRepo.findById(userId).orElse(null);
        return UserMapper.convertToUserDTO(user);
    }


/*
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

 */
}
