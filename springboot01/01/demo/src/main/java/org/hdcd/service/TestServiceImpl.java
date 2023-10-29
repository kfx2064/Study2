package org.hdcd.service;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;
import org.hdcd.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Board> list() throws Exception {
        return testMapper.list();
    }

    @Override
    public List<Item> itemList() throws Exception {
        return testMapper.itemList();
    }
}
