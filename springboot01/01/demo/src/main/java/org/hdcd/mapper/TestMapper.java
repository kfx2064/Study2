package org.hdcd.mapper;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;

import java.util.List;

public interface TestMapper {

    List<Board> list() throws Exception;

    List<Item> itemList() throws Exception;

}
