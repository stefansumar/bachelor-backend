package com.example.BachelorThesis.dto;

import com.example.BachelorThesis.enumeration.ThesisStatus;

public class StudentsThesisRes {
    private long id;
    private String title;
    private String subject;
    private String professorsName;
    private String professorsLastName;
    private ThesisStatus status;
    private String content;
    private String rejectReason;
    private String correction;

    public StudentsThesisRes() {
    }

    public StudentsThesisRes(long id, String title, String subject, String professorsName, String professorsLastName, ThesisStatus status, String content, String rejectReason, String correction) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.professorsName = professorsName;
        this.professorsLastName = professorsLastName;
        this.status = status;
        this.content = content;
        this.rejectReason = rejectReason;
        this.correction = correction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfessorsName() {
        return professorsName;
    }

    public void setProfessorsName(String professorsName) {
        this.professorsName = professorsName;
    }

    public String getProfessorsLastName() {
        return professorsLastName;
    }

    public void setProfessorsLastName(String professorsLastName) {
        this.professorsLastName = professorsLastName;
    }

    public ThesisStatus getStatus() {
        return status;
    }

    public void setStatus(ThesisStatus status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getCorrection() {
        return correction;
    }

    public void setCorrection(String correction) {
        this.correction = correction;
    }
}
