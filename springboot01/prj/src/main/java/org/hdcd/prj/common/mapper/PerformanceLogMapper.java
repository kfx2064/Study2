package org.hdcd.prj.common.mapper;

import org.hdcd.prj.domain.common.PerformanceLog;

import java.util.List;

public interface PerformanceLogMapper {

    public void create(PerformanceLog performanceLog) throws Exception;

    public List<PerformanceLog> list() throws Exception;
}
