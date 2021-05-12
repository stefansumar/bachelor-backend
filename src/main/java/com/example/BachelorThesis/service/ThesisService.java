package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ThesisService {
    Long createThesis(ThesisReq thesisReq);
    void editThesis(Long id, EditThesisReq editThesisReq);
    void acceptThesis(Long thesisId, Long professorId) throws Exception;
    void correctThesis(Long thesisId, Long professorId, CorrectionReq correctionReq) throws Exception;
    void rejectThesis(Long thesisId, Long professorId, RejectThesisReq rejectThesisReq) throws Exception;
    void uploadFile(MultipartFile file) throws IOException;
    Boolean validate(ThesisReq thesisReq);
    Boolean validateEditReq(EditThesisReq editThesisReq);
    List<StudentsThesisRes> allByStudent(Long studentId);
    List<ProfessorsThesisRes> allByProfessor(Long professorId);
}
