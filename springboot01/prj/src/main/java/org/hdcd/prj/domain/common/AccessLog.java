package org.hdcd.prj.domain.common;

import java.io.Serializable;
import java.util.Date;

public class AccessLog implements Serializable {

    private static final long serialVersionUID = -383628335780212006L;

    private String requestUri;
    private String className;
    private String classSimpleName;
    private String methodName;
    private String remoteAddr;
    private Date regDate;

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassSimpleName() {
        return classSimpleName;
    }

    public void setClassSimpleName(String classSimpleName) {
        this.classSimpleName = classSimpleName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
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
        return "AccessLog{" +
                "requestUri='" + requestUri + '\'' +
                ", className='" + className + '\'' +
                ", classSimpleName='" + classSimpleName + '\'' +
                ", methodName='" + methodName + '\'' +
                ", remoteAddr='" + remoteAddr + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}
