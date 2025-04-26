package com.example.SpringCoreDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCoreDemo.common.Coach;


import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class DemoController {
    private Coach coach;
    private Coach otherCoach;

    @Autowired
    public void setCoach(@Qualifier("tennisCoach") Coach thisCoach, @Qualifier("tennisCoach") Coach theOtherCoach) {
        coach = thisCoach;
        otherCoach = theOtherCoach;
    }


    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/")
    public String mainPage() {
        return "Hello World!";
    }

    @GetMapping("/check")
    public String check() {
        return "thisCoach and otherCoach point to same object" + (coach == otherCoach);
    }
    
}
