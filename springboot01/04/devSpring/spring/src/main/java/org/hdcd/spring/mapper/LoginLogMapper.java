package org.hdcd.spring.mapper;

import org.hdcd.spring.common.domain.LoginLog;

import java.util.List;

public interface LoginLogMapper {

    public void create(LoginLog loginLog) throws Exception;

    public List<LoginLog> list() throws Exception;
}
