package com.example.BachelorThesis.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends User{
    @Column(name = "bio")
    private String bio;
    @OneToMany(targetEntity = Subject.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    private Set<Subject> subjects;

    public Professor() { }

    public Professor(Long id, String email, String username, String password, String firstName, String lastName, String bio) {
        super(id, email, username, password, firstName, lastName);
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
