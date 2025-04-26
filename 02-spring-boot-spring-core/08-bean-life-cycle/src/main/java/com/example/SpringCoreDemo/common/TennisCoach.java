package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")    //returns true if singleton
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("inside method doMyStartupStuff " + getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method called" + getClass().getSimpleName());
    }
    
}
