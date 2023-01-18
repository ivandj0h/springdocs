package com.ivandjoh.docs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/home")
    public String getHome() {

        String home = "Welcome to the home page!";
        return "Hello " + home;
    }
}
