package com.car.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service")
public class ServiceController {


    @Value("${service.instance.name}")
    private String instance;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello from " + instance;
    }
}
