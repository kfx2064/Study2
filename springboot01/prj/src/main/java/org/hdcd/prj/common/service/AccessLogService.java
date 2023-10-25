package org.hdcd.prj.common.service;

import org.hdcd.prj.domain.common.AccessLog;

import java.util.List;

public interface AccessLogService {

    public void register(AccessLog accessLog) throws Exception;

    public List<AccessLog> list() throws Exception;
}
