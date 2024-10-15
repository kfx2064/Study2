<script setup>
import { useCartStore } from '@/stores/cart.js';
import { storeToRefs } from 'pinia';
const cartStore = useCartStore();
const { item } = storeToRefs(cartStore);
const inCart = (id) => {
  cartStore.cartItem.push(id);
};
const outCart = (id) => {
  //cartStore.cartItem = cartStore.cartItem.filter((v) => v !== id);
  cartStore.outCart(id);
};
</script>

<template>
  <h1>상품 목록</h1>
  <RouterLink to="/cart">장바구니</RouterLink>
  <ul>
    <li
      v-for="it in item"
      :key="it.id" :class="{ in: cartStore.cartItem.includes(it.id) }">
      <span>{{ it.name }}</span>
      <span>{{ it.price }}</span>
      <button v-if="!cartStore.cartItem.includes(it.id)" @click="inCart(it.id)">
        담기
      </button>
      <button v-else @click="outCart(it.id)">삭제</button>
    </li>
  </ul>
</template>

<style scoped>
.in {
  text-decoration: line-through;
}
</style>