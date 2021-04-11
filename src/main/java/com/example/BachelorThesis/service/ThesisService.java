package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.CorrectionReq;
import com.example.BachelorThesis.dto.RejectThesisReq;
import com.example.BachelorThesis.dto.ThesisReq;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ThesisService {
    Long createThesis(ThesisReq thesisReq);
    void acceptThesis(Long thesisId, Long professorId) throws Exception;
    void correctThesis(Long thesisId, Long professorId, CorrectionReq correctionReq) throws Exception;
    void rejectThesis(Long thesisId, Long professorId, RejectThesisReq rejectThesisReq) throws Exception;
    void uploadFile(MultipartFile file) throws IOException;
    Boolean validate(ThesisReq thesisReq);
}
