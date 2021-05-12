package com.example.BachelorThesis.dto;

public class EditThesisReq {
    private String thesisEdit;
    private String contentEdit;

    public EditThesisReq() {
    }

    public String getThesisEdit() {
        return thesisEdit;
    }

    public void setThesisEdit(String thesisEdit) {
        this.thesisEdit = thesisEdit;
    }

    public String getContentEdit() {
        return contentEdit;
    }

    public void setContentEdit(String contentEdit) {
        this.contentEdit = contentEdit;
    }

    public EditThesisReq(String thesisEdit, String contentEdit) {
        this.thesisEdit = thesisEdit;
        this.contentEdit = contentEdit;
    }
}
