package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.ProfessorRes;
import com.example.BachelorThesis.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll();
    Long getProfessorId();
    List<ProfessorRes> findAllProfessors();
}
