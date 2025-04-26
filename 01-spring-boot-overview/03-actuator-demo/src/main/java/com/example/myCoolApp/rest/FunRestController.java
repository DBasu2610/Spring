package com.example.myCoolApp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class FunRestController {
    

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }


    @GetMapping("/dev-tools")
    public String makeThingsEasy() {
        return "It is Automatic Restart";
    }

    @GetMapping("/cat")
    public String cat() {
        return "Meow Meow";
    }
    
    
}
