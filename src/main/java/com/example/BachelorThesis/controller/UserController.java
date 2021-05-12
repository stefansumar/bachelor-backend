package com.example.BachelorThesis.controller;

import com.example.BachelorThesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/professors")
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<?> getAllProfessors(){
        return new ResponseEntity<>(this.userService.findAllProfessors(), HttpStatus.OK);
    }

}
