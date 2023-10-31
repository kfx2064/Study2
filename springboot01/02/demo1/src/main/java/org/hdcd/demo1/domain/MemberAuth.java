package org.hdcd.demo1.domain;

import java.io.Serial;
import java.io.Serializable;

public class MemberAuth implements Serializable {

    private static final long serialVersionUID = -1414155528261398585L;

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
