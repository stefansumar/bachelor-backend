package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.RejectThesis;
import com.example.BachelorThesis.dto.ThesisReq;

public interface ThesisService {
    Long createThesis(ThesisReq thesisReq);
    void rejectThesis(Long thesisId, Long professorId, RejectThesis rejectThesis) throws Exception;
    Boolean validate(ThesisReq thesisReq);
}
