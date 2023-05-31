package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.repositories.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserRepo userRepo;

    @GetMapping(value={"/user/{name}","/user"})
    @ResponseBody
    public String getUserName(@PathVariable(name="name", required=false) String name) {
      if (name==null){
          return "NONONO";
      }
        return "Hello " + name +" noiceeee";
    }
    public ResponseEntity <User> getUserByName(@PathVariable ("name") String name){
        var us1 = new User();
        us1.setUserName(name);
        var res = userRepo.save(us1);

        return ResponseEntity.notFound().build();
    }




}
