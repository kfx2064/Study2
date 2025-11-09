package kr.co.wikibook.gallery.cart.service;

import kr.co.wikibook.gallery.cart.dto.CartRead;
import kr.co.wikibook.gallery.cart.entity.Cart;

import java.util.List;

public interface CartService {

    // 장바구니 상품 데이터 목록 조회
    List<CartRead> findAll(Integer memberId);

    // 장바구니 상품 데이터 조회
    CartRead find(Integer memberId, Integer itemId);

    // 장바구니 상품 데이터 전체 삭제
    void removeAll(Integer memberId);

    // 장바구니 상품 데이터 삭제
    void remove(Integer memberId, Integer itemId);

    // 장바구니 데이터 저장
    void save(Cart cart);

}
