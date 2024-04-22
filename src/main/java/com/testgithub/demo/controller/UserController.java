package com.testgithub.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hellouser")
    public String Hellouser(){

        System.out.println("调用了Hellouser接口");
        return "hello My name is DJH!";
    }
}
