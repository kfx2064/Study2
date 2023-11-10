package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void test() {
        // given
        memberRepository.save(new Member(1L, "A"));

        // when
        Optional<Member> member = memberRepository.findById(1L);
        List<Member> allMembers = memberRepository.findAll();

        // then
        memberRepository.deleteById(1L);
    }
}
