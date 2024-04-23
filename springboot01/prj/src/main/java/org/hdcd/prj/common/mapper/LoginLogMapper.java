package org.hdcd.prj.common.mapper;

import org.hdcd.prj.domain.common.LoginLog;

import java.util.List;

public interface LoginLogMapper {

    public void create(LoginLog loginLog) throws Exception;

    public List<LoginLog> list() throws Exception;
}
