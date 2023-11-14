package org.hdcd.spring.mapper;

import org.hdcd.spring.common.domain.AccessLog;

import java.util.List;

public interface AccessLogMapper {

    public void create(AccessLog accessLog) throws Exception;

    public List<AccessLog> list() throws Exception;

}
