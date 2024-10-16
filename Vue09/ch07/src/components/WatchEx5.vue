<template>
  <h1>ref: {{ state.count }}</h1>
  <button @click="state.count++">ref 증가</button>
</template>

<script setup>
import { reactive, ref, watch } from 'vue';
const state = reactive({
    count: 0,
});
watch(() => state.count,
    (currentValue, preValue) => {
        console.log(currentValue, preValue);
});
</script>

<style>

</style>