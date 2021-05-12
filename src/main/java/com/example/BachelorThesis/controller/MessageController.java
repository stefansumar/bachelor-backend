package com.example.BachelorThesis.controller;

import com.example.BachelorThesis.dto.MessageReq;
import com.example.BachelorThesis.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> sendMessage(@RequestBody MessageReq messageReq){
        Boolean valid = this.messageService.validate(messageReq);
        if(!valid)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        this.sendMessage(messageReq);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
