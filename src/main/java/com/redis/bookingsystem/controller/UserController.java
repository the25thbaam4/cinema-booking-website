package com.redis.bookingsystem.controller;

import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.repositories.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo repo) {
        this.userRepo = repo;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        var user = userRepo.findById(id);
        return ResponseEntity.of(user);
    }

 /*   @GetMapping({"/name/{name}","/name/", "/name"})
    @ResponseBody
    public String getUserName(@PathVariable(name="name", required=false) String name) {
      if (name==null){
          return "NONONO";
      }
        return "Hello " + name +" noiceeee";
    }
*/
  /*    public ResponseEntity <User> getUserByName(@PathVariable ("name") String name){
        var us1 = new User();
        var res = userRepo.save(us1);
        return ResponseEntity.notFound().build();
    }
*/

  /*  @GetMapping("/name/{name}")
    public ResponseEntity<User> getUserByName(@PathVariable("name") String name) {
        var res = userRepo.findByUsername(name);
        return res.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
*/



    @GetMapping("/")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }


}
