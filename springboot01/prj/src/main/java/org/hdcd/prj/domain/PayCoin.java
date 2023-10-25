package org.hdcd.prj.domain;

import java.io.Serializable;
import java.util.Date;

public class PayCoin implements Serializable {

    private static final long serialVersionUID = 4293247154903001267L;

    private int historyNo;
    private int userNo;
    private int itemId;
    private String itemName;
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

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    @Override
    public String toString() {
        return "PayCoin{" +
                "historyNo=" + historyNo +
                ", userNo=" + userNo +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", amount=" + amount +
                ", regDate=" + regDate +
                '}';
    }
}
