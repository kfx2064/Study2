package org.hdcd.prj.mapper;

import org.hdcd.prj.domain.Notice;

import java.util.List;

public interface NoticeMapper {

    public void  create(Notice notice) throws Exception;

    public Notice read(Integer noticeNo) throws Exception;

    public void update(Notice notice) throws Exception;

    public void delete(Integer noticeNo) throws Exception;

    public List<Notice> list() throws Exception;
}
