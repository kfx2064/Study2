package org.hdcd.prj.service;

import org.hdcd.prj.domain.Board;
import org.hdcd.prj.domain.common.PageRequest;

import java.util.List;

public interface BoardService {

    public void register(Board board) throws Exception;

    public Board read(Integer boardNo) throws Exception;

    public void modify(Board board) throws Exception;

    public void remove(Integer boardNo) throws Exception;

    public List<Board> list(PageRequest pageRequest) throws Exception;

    public int count(PageRequest pageRequest) throws Exception;
}
