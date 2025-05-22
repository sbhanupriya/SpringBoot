package com.example.springboot.controller;


import com.example.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping(value = "/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Bhanu Priya");
        user.setEmailId("xyz@gmail.com");
        return user;
    }


}
