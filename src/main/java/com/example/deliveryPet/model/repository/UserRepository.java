package com.example.deliveryPet.model.repository;

import com.example.deliveryPet.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmailAndPassword(String email, String password);
    User findByIdEquals(Long id);


}
