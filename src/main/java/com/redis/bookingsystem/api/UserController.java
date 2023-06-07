package com.redis.bookingsystem.api;

import com.redis.bookingsystem.models.User;
import com.redis.bookingsystem.repositories.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo repo) {
        userRepo = repo;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        var user = userRepo.findById(id);
        return ResponseEntity.of(user);
    }

    @GetMapping({"/name/{name}","/name/", "/name"})
    @ResponseBody
    public String getUserName(@PathVariable(name="name", required=false) String name) {
      if (name==null){
          return "NONONO";
      }
        return "Hello " + name +" noiceeee";
    }
 /*   public ResponseEntity <User> getUserByName(@PathVariable ("name") String name){
        var us1 = new User();
        us1.setUserName(name);
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





}
