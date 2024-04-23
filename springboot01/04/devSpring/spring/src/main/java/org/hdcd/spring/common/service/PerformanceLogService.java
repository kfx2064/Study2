package org.hdcd.spring.common.service;

import org.hdcd.spring.common.domain.PerformanceLog;

import java.util.List;

public interface PerformanceLogService {

    public void register(PerformanceLog performanceLog) throws Exception;

    public List<PerformanceLog> list() throws Exception;

}
