package org.hdcd.spring.common.service;

import org.hdcd.spring.common.domain.AccessLog;
import org.hdcd.spring.mapper.AccessLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessLogServiceImpl implements AccessLogService {

    @Autowired
    private AccessLogMapper mapper;

    @Override
    public void register(AccessLog accessLog) throws Exception {
        mapper.create(accessLog);
    }

    @Override
    public List<AccessLog> list() throws Exception {
        return mapper.list();
    }
}
