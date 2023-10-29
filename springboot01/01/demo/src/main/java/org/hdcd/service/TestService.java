package org.hdcd.service;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;

import java.util.List;

public interface TestService {

    List<Board> list() throws Exception;

    List<Item> itemList() throws Exception;
}
