package com.example.BachelorThesis.dto;

public class RejectThesis {
    private String rejectReason;

    public RejectThesis() {}

    public RejectThesis(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }
}
