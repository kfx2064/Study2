package kr.co.wikibook.gallery.cart.repository;

import kr.co.wikibook.gallery.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    // 장바구니 목록 조회
    List<Cart> findAllByMemberId(Integer memberId);

    // 장바구니 정보 조회
    Optional<Cart> findByMemberIdAndItemId(Integer memberId, Integer itemId);

    // 장바구니 삭제
    void deleteByMemberId(Integer memberId);

    // 장바구니 삭제
    void deleteByMemberIdAndItemId(Integer memberId, Integer itemId);

}
