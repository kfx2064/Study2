package org.hdcd.imageshop01.service;

import org.hdcd.imageshop01.domain.CodeDetail;

import java.util.List;

public interface CodeDetailService {

    public void register(CodeDetail codeDetail) throws Exception;

    public CodeDetail read(CodeDetail codeDetail) throws Exception;

    public void modify(CodeDetail codeDetail) throws Exception;

    public void remove(CodeDetail codeDetail) throws Exception;

    public List<CodeDetail> list() throws Exception;

}
