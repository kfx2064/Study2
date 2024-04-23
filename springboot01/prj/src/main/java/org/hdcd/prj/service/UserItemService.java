package org.hdcd.prj.service;

import org.hdcd.prj.domain.Item;
import org.hdcd.prj.domain.Member;
import org.hdcd.prj.domain.UserItem;

import java.util.List;

public interface UserItemService {

    public void register(Member member, Item item) throws Exception;

    public UserItem read(Integer userItemNo) throws Exception;

    public List<UserItem> listAll() throws Exception;

    public List<UserItem> list(Integer userNo) throws Exception;
}
