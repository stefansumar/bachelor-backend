package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.CorrectionReq;
import com.example.BachelorThesis.dto.RejectThesisReq;
import com.example.BachelorThesis.dto.ThesisReq;

public interface ThesisService {
    Long createThesis(ThesisReq thesisReq);
    void acceptThesis(Long thesisId, Long professorId) throws Exception;
    void correctThesis(Long thesisId, Long professorId, CorrectionReq correctionReq) throws Exception;
    void rejectThesis(Long thesisId, Long professorId, RejectThesisReq rejectThesisReq) throws Exception;
    Boolean validate(ThesisReq thesisReq);
}
