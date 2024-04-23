package org.hdcd.prj.common.service;

import org.hdcd.prj.common.mapper.AccessLogMapper;
import org.hdcd.prj.domain.common.AccessLog;
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
