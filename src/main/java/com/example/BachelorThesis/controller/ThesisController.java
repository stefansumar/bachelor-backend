package com.example.BachelorThesis.controller;

import com.example.BachelorThesis.dto.CorrectionReq;
import com.example.BachelorThesis.dto.RejectThesisReq;
import com.example.BachelorThesis.dto.ThesisReq;
import com.example.BachelorThesis.service.ThesisService;
import com.example.BachelorThesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/thesis")
public class ThesisController {
    @Autowired
    private ThesisService thesisService;

    @Autowired
    private UserService userService;

    public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<?> createThesis(@RequestBody ThesisReq thesisReq) throws AccessDeniedException, ParseException {

        if(!thesisService.validate(thesisReq))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        this.thesisService.createThesis(thesisReq);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{thesisId}/accept")
    @PreAuthorize("hasRole('PROFESSOR')")
    public ResponseEntity<?> acceptThesis(@PathVariable Long thesisId) throws Exception{
        Long professorId = this.userService.getProfessorId();
        this.thesisService.acceptThesis(thesisId, professorId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{thesisId}/correction")
    @PreAuthorize("hasRole('PROFESSOR')")
    public ResponseEntity<?> correctThesis(@PathVariable Long thesisId, @RequestBody CorrectionReq correctionReq) throws Exception{
        Long professorId = this.userService.getProfessorId();
        this.thesisService.correctThesis(thesisId, professorId, correctionReq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{thesisId}/reject")
    @PreAuthorize("hasRole('PROFESSOR')")
    public ResponseEntity<?> rejectThesis(@PathVariable Long thesisId, @RequestBody RejectThesisReq rejectThesisReq) throws Exception {
        Long professorId = this.userService.getProfessorId();
        this.thesisService.rejectThesis(thesisId, professorId, rejectThesisReq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/upload")
    public ResponseEntity<?> uploadFiles(@RequestParam("file") MultipartFile file) throws IOException {
        this.thesisService.uploadFile(file);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
