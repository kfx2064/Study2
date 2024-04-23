package org.hdcd.spring.mapper;

import org.hdcd.spring.common.domain.CodeLabelValue;

import java.util.List;

public interface CodeMapper {

    public List<CodeLabelValue> getCodeClassList() throws Exception;

    public List<CodeLabelValue> getCodeList(String classCode) throws Exception;
}
