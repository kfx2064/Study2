package org.hdcd.spring.domain;

import java.io.Serializable;
import java.util.Date;

public class ChargeCoin implements Serializable {

    private static final long serialVersionUID = -4386761585531369337L;

    private int historyNo;
    private int userNo;
    private int amount;
    private Date regDate;

    public int getHistoryNo() {
        return historyNo;
    }

    public void setHistoryNo(int historyNo) {
        this.historyNo = historyNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
