package com.example.BachelorThesis.repository;

import com.example.BachelorThesis.dto.ProfessorsThesisRes;
import com.example.BachelorThesis.dto.StudentsThesisRes;
import com.example.BachelorThesis.model.Thesis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ThesisRepository extends JpaRepository<Thesis, Long> {
    @Query("select new com.example.BachelorThesis.dto.StudentsThesisRes(t.id, t.title, s.title, u.firstName, u.lastName, t.status, t.content, t.rejectReason, t.correction) from Thesis as t inner join Subject as s on t.subjectId = s.id inner join User as u on t.professorId = u.id where t.studentId = :studentId")
    List<StudentsThesisRes> allByStudent(@Param("studentId") Long studentId);

    @Query("select new com.example.BachelorThesis.dto.ProfessorsThesisRes(t.id, t.title, t.content, u.firstName, u.lastName, t.status, s.title, t.rejectReason, t.correction) from Thesis as t inner join User u on t.studentId = u.id inner join Subject s on s.id = t.subjectId where t.professorId = :professorId order by t.status desc")
    List<ProfessorsThesisRes> allByProfessor(@Param("professorId") Long professorId);
}
