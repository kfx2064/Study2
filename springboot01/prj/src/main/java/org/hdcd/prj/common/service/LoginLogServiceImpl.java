package org.hdcd.prj.common.service;

import org.hdcd.prj.common.mapper.LoginLogMapper;
import org.hdcd.prj.domain.common.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogMapper mapper;

    @Override
    public void register(LoginLog loginLog) throws Exception {
        mapper.create(loginLog);
    }

    @Override
    public List<LoginLog> list() throws Exception {
        return mapper.list();
    }
}
