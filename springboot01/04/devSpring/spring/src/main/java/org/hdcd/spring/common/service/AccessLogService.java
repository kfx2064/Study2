package org.hdcd.spring.common.service;

import org.hdcd.spring.common.domain.AccessLog;

import java.util.List;

public interface AccessLogService {

    public void register(AccessLog accessLog) throws Exception;

    public List<AccessLog> list() throws Exception;

}
