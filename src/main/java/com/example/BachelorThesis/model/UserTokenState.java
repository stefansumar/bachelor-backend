package com.example.BachelorThesis.model;

public class UserTokenState {

    private String jwt;

    public UserTokenState() {
        this.jwt = null;
    }

    public UserTokenState(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String accessToken) {
        this.jwt = accessToken;
    }

}
