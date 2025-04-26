package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LetsShoutDudeController {
    

    @RequestMapping("/letsShout")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName");

        String theName2 = theName.toUpperCase();

        String result = "Hello!" + theName2;

        model.addAttribute("message", result);
        return "helloworld";
    }
}
