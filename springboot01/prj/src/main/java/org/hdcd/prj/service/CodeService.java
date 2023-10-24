package org.hdcd.prj.service;

import org.hdcd.prj.domain.common.CodeLabelValue;

import java.util.List;

public interface CodeService {

    public List<CodeLabelValue> getCodeClassList() throws Exception;

    public List<CodeLabelValue> getCodeList(String classCode) throws Exception;
}
