package org.hdcd.prj.service;

import org.hdcd.prj.domain.common.CodeLabelValue;
import org.hdcd.prj.mapper.CodeMapper;
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