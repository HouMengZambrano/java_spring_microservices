package com.example.user_service.service;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService{
    private final UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id : "+ id + " is not found"));
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
