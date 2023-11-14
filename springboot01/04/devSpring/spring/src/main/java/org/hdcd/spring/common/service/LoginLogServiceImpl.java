package org.hdcd.spring.common.service;

import org.hdcd.spring.common.domain.LoginLog;
import org.hdcd.spring.mapper.LoginLogMapper;
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
