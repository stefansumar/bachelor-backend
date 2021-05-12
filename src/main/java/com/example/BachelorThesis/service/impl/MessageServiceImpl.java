package com.example.BachelorThesis.service.impl;

import com.example.BachelorThesis.dto.MessageReq;
import com.example.BachelorThesis.model.Message;
import com.example.BachelorThesis.repository.MessageRepository;
import com.example.BachelorThesis.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Long send(MessageReq messageReq) {
        Message message = new Message();
        message.setSenderId(messageReq.getSenderId());
        message.setRecieverId(messageReq.getRecieverId());
        //message.setMessageDateTime(OffsetDateTime.now());
        this.messageRepository.save(message);
        this.messageRepository.flush();
        return message.getId();
    }

    @Override
    public Boolean validate(MessageReq messageReq){
        Long senderId = messageReq.getSenderId();
        Long recieverId = messageReq.getRecieverId();
        String message = messageReq.getMessage();

        if(senderId == null || recieverId == null || message.isEmpty())
            return false;
        else
            return true;

    }
}
