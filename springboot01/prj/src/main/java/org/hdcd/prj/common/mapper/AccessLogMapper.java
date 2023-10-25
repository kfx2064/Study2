package org.hdcd.prj.common.mapper;

import org.hdcd.prj.domain.common.AccessLog;

import java.util.List;

public interface AccessLogMapper {

    public void create(AccessLog accessLog) throws Exception;

    public List<AccessLog> list() throws Exception;
}
