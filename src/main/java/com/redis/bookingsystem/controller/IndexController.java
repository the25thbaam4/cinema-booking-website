package com.redis.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {


    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @GetMapping("/movie-page")
    public ModelAndView movies(){
        return new ModelAndView("movies");
    }


    @GetMapping("/halls")
    public ModelAndView halls(){
        return new ModelAndView("halls");
    }

}
