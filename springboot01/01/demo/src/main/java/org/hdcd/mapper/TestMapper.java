package org.hdcd.mapper;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;
import org.hibernate.boot.model.naming.ImplicitTenantIdColumnNameSource;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestMapper {

    public void create(Item item) throws Exception;

    public Item read(Integer itemId) throws Exception;

    public void update(Item item) throws Exception;

    public void delete(Integer itemId) throws Exception;

    public List<Item> list() throws Exception;

    public String getPicture(Integer itemId) throws Exception;

    public void addAttach(String fullName) throws Exception;

    public List<String> getAttach(Integer itemId) throws Exception;

    public void deleteAttach(Integer itemId) throws Exception;

    public void replaceAttach(@Param("fullName") String fullName
            , @Param("itemId") Integer itemId) throws Exception;

    public void createBoard(Board board) throws Exception;

    public Board readBoard(Integer boardNo) throws Exception;

    public void updateBoard(Board board) throws Exception;

    public void deleteBoard(Integer boardNo) throws Exception;

    public List<Board> listBoard() throws Exception;

}
