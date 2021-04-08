package com.example.BachelorThesis.model;

import com.example.BachelorThesis.enumeration.ThesisStatus;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Thesis {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "title")
    private String title;
    @NotNull
    @Column(name = "content")
    private String content;
    @NotNull
    @Column(name = "subject_id")
    private Long subjectId;
    @NotNull
    @Column(name = "student_id")
    private Long studentId;
    @NotNull
    @Column(name = "professor_id")
    private Long professorId;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ThesisStatus status;

    public Thesis() {}

    public Thesis(Long id, String title, String content, Long subjectId, Long studentId, Long professorId, ThesisStatus status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.professorId = professorId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public ThesisStatus getStatus() {
        return status;
    }

    public void setStatus(ThesisStatus status) {
        this.status = status;
    }
}
