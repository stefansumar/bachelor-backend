package com.example.BachelorThesis.dto;

public class CorrectionReq {
    private String correction;

    public CorrectionReq() {}

    public CorrectionReq(String correction) {
        this.correction = correction;
    }

    public String getCorrection() { return correction; }

    public void setCorrection(String correction) { this.correction = correction; }

}
