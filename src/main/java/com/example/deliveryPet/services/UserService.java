package com.example.deliveryPet.services;


import com.example.deliveryPet.model.entity.User;
import com.example.deliveryPet.model.entity.enums.Role;
import com.example.deliveryPet.model.repository.UserRepository;
import com.example.deliveryPet.utility.InputValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    InputValid inputValid;


@ExceptionHandler
    public User addUser(String email,String password){
    User user = new User(email,password);

        user.setRole(Role.USER);
return userRepository.saveAndFlush(user);
    }
}
