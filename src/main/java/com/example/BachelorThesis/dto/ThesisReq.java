package com.example.BachelorThesis.dto;

public class ThesisReq {
    private String title;
    private String content;
    private Long subjectId;
    private Long studentId;
    private Long professorId;

    public ThesisReq() {}

    public ThesisReq(String title, String content, Long subjectId, Long studentId, Long professorId) {
        this.title = title;
        this.content = content;
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.professorId = professorId;
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

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

}
