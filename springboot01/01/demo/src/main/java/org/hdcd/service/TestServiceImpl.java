package org.hdcd.service;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;
import org.hdcd.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Transactional
    @Override
    public void regist(Item item) throws Exception {
        testMapper.create(item);

        String[] files = item.getFiles();

        if (files == null) {
            return;
        }

        for (String fileName : files) {
            testMapper.addAttach(fileName);
        }
    }

    @Override
    public Item read(Integer itemId) throws Exception {
        return testMapper.read(itemId);
    }

    @Transactional
    @Override
    public void modify(Item item) throws Exception {
        testMapper.update(item);

        Integer itemId = item.getItemId();

        testMapper.deleteAttach(itemId);

        String[] files = item.getFiles();

        if (files == null) {
            return;
        }

        for (String fileName : files) {
            testMapper.replaceAttach(fileName, itemId);
        }
    }

    @Transactional
    @Override
    public void remove(Integer itemId) throws Exception {
        testMapper.deleteAttach(itemId);
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
    public List<String> getAttach(Integer itemId) throws Exception {
        return testMapper.getAttach(itemId);
    }

    @Override
    public void createBoard(Board board) throws Exception {
        testMapper.createBoard(board);
    }

    @Override
    public Board readBoard(Integer boardNo) throws Exception {
        return testMapper.readBoard(boardNo);
    }

    @Override
    public void updateBoard(Board board) throws Exception {
        testMapper.updateBoard(board);
    }

    @Override
    public void deleteBoard(Integer boardNo) throws Exception {
        testMapper.deleteBoard(boardNo);
    }

    @Override
    public List<Board> listBoard() throws Exception {
        return testMapper.listBoard();
    }
}
