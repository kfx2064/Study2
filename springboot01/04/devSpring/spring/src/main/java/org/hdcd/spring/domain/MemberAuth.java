package org.hdcd.spring.domain;

import java.io.Serializable;

public class MemberAuth implements Serializable {

    private static final long serialVersionUID = 7929461727239517660L;

    private int userNo;
    private String auth;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
