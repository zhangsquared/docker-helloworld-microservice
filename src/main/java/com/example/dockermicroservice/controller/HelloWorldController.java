package com.example.dockermicroservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${server.port}")

    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World, " + port;
    }
}
