package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.MessageReq;

public interface MessageService {
    Long send(MessageReq messageReq);
    Boolean validate(MessageReq messageReq);
}
