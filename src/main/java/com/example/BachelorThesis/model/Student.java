package com.example.BachelorThesis.model;

import com.example.BachelorThesis.enumeration.StudentStatus;

import javax.persistence.*;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends User{
    @Column(name = "allow_to_apply")
    private Boolean allowToApply;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StudentStatus status;

    public Student() {}

    public Boolean getAllowToApply() {
        return allowToApply;
    }

    public void setAllowToApply(Boolean allowToApply) {
        this.allowToApply = allowToApply;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

}
