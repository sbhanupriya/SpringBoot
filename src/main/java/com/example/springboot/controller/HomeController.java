package com.example.springboot.controller;


import com.example.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String test){
        return "The path variable is: " + id + " - " + test;
    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(name = "email" , required = false, defaultValue = "") String emailId){
        return "Your name is " + name + " & email is : " + emailId;
    }
}
