package org.hdcd.spring.common.domain;

import java.io.Serializable;
import java.util.Date;

public class PerformanceLog implements Serializable {

    private static final long serialVersionUID = -5468947593521635292L;

    private String signatureName;
    private String signatureTypeName;
    private long durationTime;
    private Date regDate;

    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public String getSignatureTypeName() {
        return signatureTypeName;
    }

    public void setSignatureTypeName(String signatureTypeName) {
        this.signatureTypeName = signatureTypeName;
    }

    public long getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(long durationTime) {
        this.durationTime = durationTime;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
