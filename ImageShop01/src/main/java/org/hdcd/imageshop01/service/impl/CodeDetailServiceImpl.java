package org.hdcd.imageshop01.service.impl;

import org.hdcd.imageshop01.domain.CodeDetail;
import org.hdcd.imageshop01.mapper.CodeDetailMapper;
import org.hdcd.imageshop01.service.CodeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeDetailServiceImpl implements CodeDetailService {

    @Autowired
    private CodeDetailMapper mapper;

    @Override
    public void register(CodeDetail codeDetail) throws Exception {
        
    }

    @Override
    public CodeDetail read(CodeDetail codeDetail) throws Exception {
        return null;
    }

    @Override
    public void modify(CodeDetail codeDetail) throws Exception {

    }

    @Override
    public void remove(CodeDetail codeDetail) throws Exception {

    }

    @Override
    public List<CodeDetail> list() throws Exception {
        return null;
    }
}
