package com.example.BachelorThesis.service.impl;

import com.example.BachelorThesis.dto.ProfessorRes;
import com.example.BachelorThesis.model.User;
import com.example.BachelorThesis.repository.UserRepository;
import com.example.BachelorThesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    @Override
    public Long getProfessorId() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String professorUsername = userDetails.getUsername();
        User user = this.findByUsername(professorUsername);
        return user.getId();
    }

    @Override
    public List<ProfessorRes> findAllProfessors() {
        return this.userRepository.getAllProfessors();
    }
}
