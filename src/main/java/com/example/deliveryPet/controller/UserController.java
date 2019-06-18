package com.example.deliveryPet.controller;


import com.example.deliveryPet.model.entity.User;
import com.example.deliveryPet.model.repository.UserRepository;
import com.example.deliveryPet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


@Autowired
    UserService userService;



@GetMapping("/")
public String index(){
    return "user";
}
    @PostMapping("/createUser")
    public String createUser(@RequestParam(name = "email") String email,@RequestParam(name = "password") String password ) {
        User user = new User(email,password);
        userService.addUser(user);
        return "user";

    }
}
