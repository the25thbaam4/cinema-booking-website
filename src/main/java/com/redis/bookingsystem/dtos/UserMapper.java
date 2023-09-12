package com.redis.bookingsystem.dtos;

import com.redis.bookingsystem.models.Order;
import com.redis.bookingsystem.models.User;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class UserMapper {

    public static UserDTO convertToUserDTO(User user){
        if (user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setAge(user.getAge());
        userDTO.setUsername(user.getUsername());


           userDTO.setOrders(user.getOrders());


        return userDTO;
    }



    public static User convertToUser(UserDTO userDTO) {
        User user = new User();
        user.setAge(userDTO.getAge());
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setOrders(userDTO.getOrders());

        return user;
    }
}
