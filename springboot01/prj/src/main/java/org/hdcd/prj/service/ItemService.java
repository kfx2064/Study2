package org.hdcd.prj.service;

import org.hdcd.prj.domain.Item;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface ItemService {

    public void register(Item item) throws Exception;

    public Item read(Integer itemId) throws Exception;

    public void modify(Item item) throws Exception;

    public void remove(Integer itemId) throws Exception;

    public List<Item> list() throws Exception;

    public String getPicture(Integer itemId) throws Exception;

    public String getPreview(Integer itemId) throws Exception;
}
