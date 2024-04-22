package com.testgithub.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hellouser")
    public String Hellouser(String name){
        return "hello My name is DJH!";
    }
}
