package org.hdcd.prj.domain.common;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {

    private static final long serialVersionUID = -6710410129268036937L;

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

    @Override
    public String toString() {
        return "LoginLog{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", remoteAddr='" + remoteAddr + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}
