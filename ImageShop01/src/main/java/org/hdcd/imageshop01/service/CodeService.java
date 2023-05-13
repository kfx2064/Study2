package org.hdcd.imageshop01.service;

import org.hdcd.imageshop01.domain.CodeLabelValue;

import java.util.List;

public interface CodeService {

    public List<CodeLabelValue> getCodeClassList() throws Exception;

    public List<CodeLabelValue> getCodeList(String classCode) throws Exception;

}
