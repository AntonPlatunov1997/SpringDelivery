package com.example.deliveryPet.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {



    @GetMapping("/user")
    public String user() {
        return "user";

    }
}