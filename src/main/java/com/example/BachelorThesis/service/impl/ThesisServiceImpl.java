package com.example.BachelorThesis.service.impl;

import com.example.BachelorThesis.dto.ThesisReq;
import com.example.BachelorThesis.enumeration.ThesisStatus;
import com.example.BachelorThesis.model.Thesis;
import com.example.BachelorThesis.repository.ThesisRepository;
import com.example.BachelorThesis.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThesisServiceImpl implements ThesisService {

    @Autowired
    private ThesisRepository thesisRepository;

    @Override
    public Long createThesis(ThesisReq thesisReq) {
        Thesis thesis = new Thesis();
        thesis.setTitle(thesisReq.getTitle());
        thesis.setContent(thesisReq.getContent());
        thesis.setSubjectId(thesisReq.getSubjectId());
        thesis.setStudentId(thesisReq.getStudentId());
        thesis.setProfessorId(thesisReq.getProfessorId());
        thesis.setStatus(ThesisStatus.WAITING_FOR_REVIEW);

        return thesisRepository.save(thesis).getId();
    }

    @Override
    public Boolean validate(ThesisReq thesisReq) {
        String title = thesisReq.getTitle();
        String content = thesisReq.getContent();
        Long subjectId = thesisReq.getSubjectId();
        Long studentId = thesisReq.getStudentId();
        Long professorId = thesisReq.getProfessorId();

        if(title.isEmpty()     || content.isEmpty()   ||
           subjectId == null   || studentId == null   ||
           professorId == null
          ) return false;
        else return true;
    }
}
