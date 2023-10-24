package org.hdcd.imageshop01.service.impl;

import org.hdcd.imageshop01.domain.CodeClass;
import org.hdcd.imageshop01.mapper.CodeClassMapper;
import org.hdcd.imageshop01.service.CodeClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("codeClassServiceImpl")
public class CodeClassServiceImpl implements CodeClassService {

    @Resource(name = "codeClassMapper")
    private CodeClassMapper mapper;

    @Override
    public void register(CodeClass codeClass) throws Exception {
        mapper.create(codeClass);
    }

    @Override
    public CodeClass read(String classCode) throws Exception {
        return mapper.read(classCode);
    }

    @Override
    public void modify(CodeClass codeClass) throws Exception {
        mapper.update(codeClass);
    }

    @Override
    public void remove(String classCode) throws Exception {
        mapper.delete(classCode);
    }

    @Override
    public List<CodeClass> list() throws Exception {
        return mapper.list();
    }
}
