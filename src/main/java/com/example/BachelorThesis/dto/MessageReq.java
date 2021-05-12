package com.example.BachelorThesis.dto;

public class MessageReq {
    private Long senderId;
    private Long recieverId;
    private String message;

    public MessageReq() {
    }

    public MessageReq(Long senderId, Long recieverId, String message) {
        this.senderId = senderId;
        this.recieverId = recieverId;
        this.message = message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
