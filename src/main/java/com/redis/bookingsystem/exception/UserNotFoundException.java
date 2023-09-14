package com.redis.bookingsystem.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(long id){
        super("user with ID:" + id +" does not exist.");
    }

}
