package org.hdcd.prj.mapper;

import org.hdcd.prj.domain.common.CodeLabelValue;

import java.util.List;

public interface CodeMapper {

    public List<CodeLabelValue> getCodeClassList() throws Exception;

    public List<CodeLabelValue> getCodeList(String classCode) throws Exception;
}
