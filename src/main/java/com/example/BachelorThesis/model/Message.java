package com.example.BachelorThesis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sender_id")
    private Long senderId;
    @Column(name = "reciever_id")
    private Long recieverId;
//    @Column(name = "message-date-time")
//    private OffsetDateTime messageDateTime;

    public Message() {
    }

    public Message(Long senderId, Long recieverId) {
        this.senderId = senderId;
        this.recieverId = recieverId;
//        this.messageDateTime = messageDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(Long recieverId) {
        this.recieverId = recieverId;
    }

//    public OffsetDateTime getMessageDateTime() {
//        return messageDateTime;
//    }

//    public void setMessageDateTime(OffsetDateTime messageDateTime) {
//        this.messageDateTime = messageDateTime;
//    }
}
