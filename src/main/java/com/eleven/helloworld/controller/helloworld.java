package com.eleven.helloworld.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class helloworld {

    @GetMapping("/msg")
    public String msg(){
        return "hello world";
    }

}
