package com.testgithub.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hellouser")
    public String Hellouser(){
        return "hello My name is DJH!";
    }
}
