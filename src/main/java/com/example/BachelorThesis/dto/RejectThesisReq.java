package com.example.BachelorThesis.dto;

public class RejectThesisReq {
    private String rejectReason;

    public RejectThesisReq() {}

    public RejectThesisReq(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }
}
