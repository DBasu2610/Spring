package com.example.SpringCoreDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCoreDemo.common.Coach;


import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public void setCoach( @Qualifier("tennisCoach") Coach thisCoach) {
        System.out.println("In constructor : "+getClass().getSimpleName());
        coach = thisCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/")
    public String mainPage() {
        return "Hello World!";
    }
}
