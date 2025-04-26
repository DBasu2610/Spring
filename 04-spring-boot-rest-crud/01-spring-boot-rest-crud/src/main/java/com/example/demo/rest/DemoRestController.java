package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/hello")
public class DemoRestController {
    
    @GetMapping("/test")
    public String getHello() {
        return "Hello";
    }
    
}
