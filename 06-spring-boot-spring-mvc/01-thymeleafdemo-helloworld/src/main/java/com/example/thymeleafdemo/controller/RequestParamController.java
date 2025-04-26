package com.example.thymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RequestParamController {
    @PostMapping("/letsShout2")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {

        

        String theName2 = theName.toUpperCase();

        String result = "Hello! How Ya" + theName2;

        model.addAttribute("messages", result);
        return "helloworld";
    }
}
