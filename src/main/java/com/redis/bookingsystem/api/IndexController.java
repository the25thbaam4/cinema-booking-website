package com.redis.bookingsystem.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {


    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
