package com.example.BachelorThesis.model;

import com.example.BachelorThesis.enumeration.StudentStatus;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends User{
    private Boolean allowToApply;
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
