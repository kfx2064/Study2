<script setup>
import { useCartStore } from '@/stores/cart.js';
import { computed } from 'vue';
import { routeLocationKey } from 'vue-router';
const cartStore = useCartStore();
const cartItem = computed(() => {
    return cartStore.item.filter((v) => cartStore.cartItem.includes(v.id));
});
const allClear = () => {
    cartStore.cartItem = [];
};
const payCart = () => {
    const price = cartItem.value.reduce((prev, cur) => {
        return prev + cur.price;
    }, 0);
    alert(`총 ${price.toLocaleString()}원을 결제하시겠습니까?`);
};
const outCart = (id) => {
    //cartStore.cartItem = cartStore.cartItem.filter((v) => v !== id);
    cartStore.outCart(id);
}
</script>

<template>
    <h1>장바구니 목록</h1>
    <RouterLink to="/">메인</RouterLink>
    <ul v-if="cartItem.length > 0">
        <li v-for="item in cartItem">
            <span>{{ item.name }}</span>
            <span>{{ item.price }}</span>
            <button @click="outCart(item.id)">삭제</button>
        </li>
    </ul>
    <p v-else>장바구니가 비었습니다.</p>
    <button @click="payCart">결제</button>
    <button @click="allClear">전체 비우기</button>
</template>