package org.hdcd.spring.common.service;

import org.hdcd.spring.common.domain.LoginLog;

import java.util.List;

public interface LoginLogService {

    public void register(LoginLog loginLog) throws Exception;

    public List<LoginLog> list() throws Exception;

}
