package org.hdcd.imageshop01.service.impl;

import org.hdcd.imageshop01.domain.CodeLabelValue;
import org.hdcd.imageshop01.mapper.CodeMapper;
import org.hdcd.imageshop01.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper mapper;

    @Override
    public List<CodeLabelValue> getCodeClassList() throws Exception {
        return mapper.getCodeClassList();
    }

    @Override
    public List<CodeLabelValue> getCodeList(String classCode) throws Exception {
        return mapper.getCodeList(classCode);
    }
}
