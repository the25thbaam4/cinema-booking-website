package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.dtos.UserDTO;
import com.redis.bookingsystem.dtos.UserMapper;
import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

  //  @Autowired


    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO userDTO = userService.getUserById(id);

        if (userDTO != null) {
            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        // Convert the UserDTO received in the request to a User entity
        User user = UserMapper.convertToUser(userDTO);

        // Call the UserService to create the user
        User createdUser = userService.createUser(user);

        // Convert the created User entity back to a UserDTO
        UserDTO createdUserDTO = UserMapper.convertToUserDTO(createdUser);

        // Return the created UserDTO in the response
        return new ResponseEntity<>(createdUserDTO, HttpStatus.CREATED);
    }


}
