package org.hdcd.prj.common.service;

import org.hdcd.prj.domain.common.LoginLog;

import java.util.List;

public interface LoginLogService {

    public void register(LoginLog loginLog) throws Exception;

    public List<LoginLog> list() throws Exception;
}
