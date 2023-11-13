package org.hdcd.spring.mapper;

import org.hdcd.spring.domain.Member;
import org.hdcd.spring.domain.MemberAuth;

import java.util.List;

public interface MemberMapper {

    public Member readByUserId(String userId);

    public void create(Member member) throws Exception;

    public Member read(int userNo) throws Exception;

    public void update(Member member) throws Exception;

    public void delete(int userNo) throws Exception;

    public List<Member> list() throws Exception;

    public void createAuth(MemberAuth memberAuth) throws Exception;

    public void deleteAuth(int userNo) throws Exception;
}
