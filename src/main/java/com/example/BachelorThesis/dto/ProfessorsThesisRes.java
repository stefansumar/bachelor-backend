package com.example.BachelorThesis.dto;

import com.example.BachelorThesis.enumeration.ThesisStatus;

public class ProfessorsThesisRes {
    private long thesisId;
    private String title;
    private String content;
    private String studentsName;
    private String studentsLastName;
    private ThesisStatus status;
    private String subject;
    private String rejectReason;
    private String correction;

    public ProfessorsThesisRes() {
    }

    public ProfessorsThesisRes(long thesisId, String title, String content, String studentsName, String studentsLastName, ThesisStatus status, String subject, String rejectReason, String correction) {
        this.thesisId = thesisId;
        this.title = title;
        this.content = content;
        this.studentsName = studentsName;
        this.studentsLastName = studentsLastName;
        this.status = status;
        this.subject = subject;
        this.rejectReason = rejectReason;
        this.correction = correction;
    }

    public long getThesisId() {
        return thesisId;
    }

    public void setThesisId(long thesisId) {
        this.thesisId = thesisId;
    }

    public ThesisStatus getStatus() {
        return status;
    }

    public void setStatus(ThesisStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getStudentsLastName() {
        return studentsLastName;
    }

    public void setStudentsLastName(String studentsLastName) {
        this.studentsLastName = studentsLastName;
    }
}
