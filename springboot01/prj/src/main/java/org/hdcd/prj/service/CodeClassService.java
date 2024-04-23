package org.hdcd.prj.service;

import org.hdcd.prj.domain.CodeClass;

import java.util.List;

public interface CodeClassService {

    public void register(CodeClass codeClass) throws Exception;

    public CodeClass read(String classCode) throws Exception;

    public void modify(CodeClass codeClass) throws Exception;

    public void remove(String classCode) throws Exception;

    public List<CodeClass> list() throws Exception;

}