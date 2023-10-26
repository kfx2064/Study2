package org.hdcd.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Card implements Serializable {

    private static final long serialVersionUID = -1555464460892895832L;

    private String no;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date validMonth;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(Date validMonth) {
        this.validMonth = validMonth;
    }
}
