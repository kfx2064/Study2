package org.hdcd.prj.mapper;

import org.hdcd.prj.domain.CodeDetail;

import java.util.List;

public interface CodeDetailMapper {

    public void create(CodeDetail codeDetail) throws Exception;

    public CodeDetail read(CodeDetail codeDetail) throws Exception;

    public void update(CodeDetail codeDetail) throws Exception;

    public void delete(CodeDetail codeDetail) throws Exception;

    public List<CodeDetail> list() throws Exception;

    public Integer getMaxSortSeq(String classCode) throws Exception;
}
