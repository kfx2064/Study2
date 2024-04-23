package org.hdcd.prj.common.service;

import org.hdcd.prj.domain.common.PerformanceLog;

import java.util.List;

public interface PerformanceLogService {

    public void register(PerformanceLog performanceLog) throws Exception;

    public List<PerformanceLog> list() throws Exception;
}
