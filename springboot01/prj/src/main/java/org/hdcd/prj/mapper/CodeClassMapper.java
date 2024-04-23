package org.hdcd.prj.mapper;

import org.hdcd.prj.domain.CodeClass;

import java.util.List;

public interface CodeClassMapper {

    public void create(CodeClass codeClas) throws Exception;

    public CodeClass read(String classCode) throws Exception;

    public void update(CodeClass codeClass) throws Exception;

    public void delete(String classCode) throws Exception;

    public List<CodeClass> list() throws Exception;

}
