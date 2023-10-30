package org.hdcd.service;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;

import java.util.List;

public interface TestService {

    public void regist(Item item) throws Exception;

    public Item read(Integer itemId) throws Exception;

    public void modify(Item item) throws Exception;

    public void remove(Integer itemId) throws Exception;

    public List<Item> list() throws Exception;

    public String getPicture(Integer itemId) throws Exception;

    public List<String> getAttach(Integer itemId) throws Exception;

    public void createBoard(Board board) throws Exception;

    public Board readBoard(Integer boardNo) throws Exception;

    public void updateBoard(Board board) throws Exception;

    public void deleteBoard(Integer boardNo) throws Exception;

    public List<Board> listBoard() throws Exception;

}
