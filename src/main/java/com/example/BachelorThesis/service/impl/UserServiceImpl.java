package com.example.BachelorThesis.service.impl;

import com.example.BachelorThesis.model.User;
import com.example.BachelorThesis.repository.UserRepository;
import com.example.BachelorThesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User findById(Long id) {
        User u = userRepository.findById(id).orElseGet(null);
        return u;
    }

    @Override
    public User findByUsername(String username) {
        User u = userRepository.findByUsername(username);
        return u;
    }

    @Override
    public List<User> findAll() {
        List<User> result = userRepository.findAll();
        return result;
    }
}
