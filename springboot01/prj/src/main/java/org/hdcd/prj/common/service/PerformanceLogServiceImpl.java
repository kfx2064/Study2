package org.hdcd.prj.common.service;

import org.hdcd.prj.common.mapper.PerformanceLogMapper;
import org.hdcd.prj.domain.common.PerformanceLog;
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
