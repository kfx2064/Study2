package org.hdcd.spring.common.service;

import org.hdcd.spring.common.domain.PerformanceLog;
import org.hdcd.spring.mapper.PerformanceLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformanceLogServiceImpl implements PerformanceLogService {

    @Autowired
    private PerformanceLogMapper mapper;

    @Override
    public void register(PerformanceLog performanceLog) throws Exception {
        mapper.create(performanceLog);
    }

    @Override
    public List<PerformanceLog> list() throws Exception {
        return mapper.list();
    }
}
