package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach();
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

}
