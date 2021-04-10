package com.example.BachelorThesis.controller;

import com.example.BachelorThesis.dto.RejectThesis;
import com.example.BachelorThesis.dto.ThesisReq;
import com.example.BachelorThesis.model.User;
import com.example.BachelorThesis.service.ThesisService;
import com.example.BachelorThesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/thesis")
public class ThesisController {
    @Autowired
    private ThesisService thesisService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<?> createThesis(@RequestBody ThesisReq thesisReq) throws AccessDeniedException, ParseException {

        if(!thesisService.validate(thesisReq))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Long id = this.thesisService.createThesis(thesisReq);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{thesisId}/reject")
    @PreAuthorize("hasRole('PROFESSOR')")
    public ResponseEntity<?> refuseThesis(@RequestHeader("Authorization") String token, @PathVariable Long thesisId, @RequestBody RejectThesis rejectThesis) throws Exception {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String professorUsername = userDetails.getUsername();
        User user = this.userService.findByUsername(professorUsername);
        Long professorId = user.getId();

        this.thesisService.rejectThesis(thesisId, professorId, rejectThesis);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
