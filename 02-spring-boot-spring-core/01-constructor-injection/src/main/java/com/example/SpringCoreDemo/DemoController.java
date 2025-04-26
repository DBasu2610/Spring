package com.example.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {
    private Coach coach;
    
    @Autowired
    public DemoController(Coach thisCoach) {
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
