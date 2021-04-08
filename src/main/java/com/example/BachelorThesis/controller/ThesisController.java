package com.example.BachelorThesis.controller;

import com.example.BachelorThesis.dto.ThesisReq;
import com.example.BachelorThesis.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/thesis")
public class ThesisController {
    @Autowired
    private ThesisService thesisService;

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<?> createThesis(@RequestBody ThesisReq thesisReq) throws AccessDeniedException, ParseException {

        if(!thesisService.validate(thesisReq))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Long id = this.thesisService.createThesis(thesisReq);
        return new ResponseEntity<Long>(id, HttpStatus.CREATED);
    }
}
