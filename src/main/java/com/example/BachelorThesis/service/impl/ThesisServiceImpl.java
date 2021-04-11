package com.example.BachelorThesis.service.impl;

import com.example.BachelorThesis.dto.CorrectionReq;
import com.example.BachelorThesis.dto.RejectThesisReq;
import com.example.BachelorThesis.dto.ThesisReq;
import com.example.BachelorThesis.enumeration.ThesisStatus;
import com.example.BachelorThesis.model.Thesis;
import com.example.BachelorThesis.repository.ThesisRepository;
import com.example.BachelorThesis.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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
        return this.thesisRepository.save(thesis).getId();
    }

    @Override
    public void acceptThesis(Long thesisId, Long professorId) throws Exception {
        Thesis thesis = this.thesisRepository.getOne(thesisId);
        if(thesis.getProfessorId() != professorId)
            throw new Exception("Professor is not allowed to reject thesis.");
        thesis.setStatus(ThesisStatus.ACCEPTED);
        this.thesisRepository.save(thesis);
    }

    @Override
    public void correctThesis(Long thesisId, Long professorId, CorrectionReq correctionReq) throws Exception {
        Thesis thesis = this.thesisRepository.getOne(thesisId);
        if(thesis.getProfessorId() != professorId)
            throw new Exception("Professor is not allowed to reject thesis.");
        thesis.setStatus(ThesisStatus.ON_CORRECTION);
        thesis.setCorrection(correctionReq.getCorrection());
        this.thesisRepository.save(thesis);
    }

    @Override
    public void rejectThesis(Long thesisId, Long professorId, RejectThesisReq rejectThesisReq) throws Exception {
       Thesis thesis = this.thesisRepository.getOne(thesisId);
       if(thesis.getProfessorId() != professorId)
           throw new Exception("Professor is not allowed to reject thesis.");
       thesis.setStatus(ThesisStatus.REJECTED);
       thesis.setRejectReason(rejectThesisReq.getRejectReason());
       this.thesisRepository.save(thesis);
    }

    @Override
    public void uploadFile(MultipartFile file) throws IOException {
        //TODO: Change absolute path to relative path
        file.transferTo(new File("C:\\Users\\2\\Desktop\\diblomzgi\\BachelorThesis\\BachelorThesis\\src\\main\\resources\\files\\" + file.getOriginalFilename()));
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
