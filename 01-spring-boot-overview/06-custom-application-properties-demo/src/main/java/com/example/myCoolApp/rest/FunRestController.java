package com.example.myCoolApp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class FunRestController {


    @Value("${me.name}")
    private String myName;

    @Value("${me.email}")
    private String myEmail;


    @GetMapping("/me") 
    public String me() {
        return "Hello! My Name is " + myName + " and my email is " + myEmail;
    }
    

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
