package com.Hackathon_1.hackproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Backend is working!";
    }

    @GetMapping("/test")
    public String test() {
        return "API is live";
    }
}