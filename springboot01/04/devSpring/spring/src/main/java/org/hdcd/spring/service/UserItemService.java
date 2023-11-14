package org.hdcd.spring.service;

import org.hdcd.spring.domain.Item;
import org.hdcd.spring.domain.Member;
import org.hdcd.spring.domain.UserItem;

import java.util.List;

public interface UserItemService {

    public void register(Member member, Item item) throws Exception;

    public UserItem read(Integer userItemNo) throws Exception;

    public List<UserItem> listAll() throws Exception;

    public List<UserItem> list(Integer userNo) throws Exception;
}
