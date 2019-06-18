package com.example.deliveryPet.services;

import com.example.deliveryPet.model.entity.User;
import com.example.deliveryPet.model.entity.enums.Role;
import com.example.deliveryPet.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        user.setRole(Role.USER);
return userRepository.saveAndFlush(user);
    }
}
