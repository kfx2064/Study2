package org.hdcd.imageshop01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.hdcd.imageshop01.domain.CodeClass;

import java.util.List;

@Mapper
public interface CodeClassMapper {

    public void create(CodeClass codeClass) throws Exception;

    public CodeClass read(String classCode) throws Exception;

    public void update(CodeClass codeClass) throws Exception;

    public void delete(String classCode) throws Exception;

    public List<CodeClass> list() throws Exception;

}
