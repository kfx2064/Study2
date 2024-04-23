package org.hdcd.spring.common.domain;

import java.io.Serializable;

public class CodeLabelValue implements Serializable {

    private static final long serialVersionUID = -8121796436233246048L;

    private String label;
    private String value;

    public CodeLabelValue() {
        super();
    }

    public CodeLabelValue(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
