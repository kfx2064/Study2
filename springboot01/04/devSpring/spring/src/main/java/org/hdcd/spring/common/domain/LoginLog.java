package org.hdcd.spring.common.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {

    private static final long serialVersionUID = -9081829987212524169L;

    private int userNo;
    private String userId;
    private String remoteAddr;
    private Date regDate;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
