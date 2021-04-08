package com.example.BachelorThesis.service;

import com.example.BachelorThesis.dto.ThesisReq;

public interface ThesisService {
    Long createThesis(ThesisReq thesisReq);
    Boolean validate(ThesisReq thesisReq);
}
