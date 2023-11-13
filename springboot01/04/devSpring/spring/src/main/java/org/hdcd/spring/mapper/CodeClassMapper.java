package org.hdcd.spring.mapper;

import org.hdcd.spring.domain.CodeClass;

import java.util.List;

public interface CodeClassMapper {

    public void create(CodeClass codeClass) throws Exception;

    public CodeClass read(String classCode) throws Exception;

    public void update(CodeClass codeClass) throws Exception;

    public void delete(String classCode) throws Exception;

    public List<CodeClass> list() throws Exception;
}
