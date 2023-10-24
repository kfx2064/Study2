package org.hdcd.imageshop01.mapper;

import org.hdcd.imageshop01.domain.CodeLabelValue;

import java.util.List;

public interface CodeMapper {

    public List<CodeLabelValue> getCodeClassList() throws Exception;

    public List<CodeLabelValue> getCodeList(String classCode) throws Exception;

}
