package org.hdcd.spring.service;

import org.hdcd.spring.common.domain.CodeLabelValue;
import org.hdcd.spring.mapper.CodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
