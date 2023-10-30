package org.hdcd.mapper;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;
import org.hibernate.boot.model.naming.ImplicitTenantIdColumnNameSource;

import java.util.List;

public interface TestMapper {

    public void create(Item item) throws Exception;

    public Item read(Integer itemId) throws Exception;

    public void update(Item item) throws Exception;

    public void delete(Integer itemId) throws Exception;

    public List<Item> list() throws Exception;

    public String getPicture(Integer itemId) throws Exception;

    public String getPicture2(Integer itemId) throws Exception;

}
