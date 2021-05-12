package com.example.BachelorThesis.repository;

import com.example.BachelorThesis.dto.ProfessorRes;
import com.example.BachelorThesis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    @Query("select new com.example.BachelorThesis.dto.ProfessorRes(u.id, u.firstName, u.lastName, s.title, s.id) from User as u inner join Subject as s on u.id = s.professor order by u.lastName")
    List<ProfessorRes> getAllProfessors();
}
