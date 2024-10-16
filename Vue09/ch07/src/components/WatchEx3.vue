<template>
  <h1>reactive: {{ state.count }}</h1>
  <button @click="state.count++">ref 증가</button>
</template>

<script setup>
import { reactive, watch } from 'vue';
const state = reactive({
    count: 0,
});
watch(state, (currentValue, preValue) => {
    console.log(currentValue, preValue);
});
</script>

<style>

</style>