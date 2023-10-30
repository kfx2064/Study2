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
    public void regist(Item item) throws Exception {
        testMapper.create(item);
    }

    @Override
    public Item read(Integer itemId) throws Exception {
        return testMapper.read(itemId);
    }

    @Override
    public void modify(Item item) throws Exception {
        testMapper.update(item);
    }

    @Override
    public void remove(Integer itemId) throws Exception {
        testMapper.delete(itemId);
    }

    @Override
    public List<Item> list() throws Exception {
        return testMapper.list();
    }

    @Override
    public String getPicture(Integer itemId) throws Exception {
        return testMapper.getPicture(itemId);
    }

    @Override
    public String getPicture2(Integer itemId) throws Exception {
        return testMapper.getPicture2(itemId);
    }
}
