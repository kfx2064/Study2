<script setup>
import { ref, watch } from 'vue';
const count = ref(0);
watch(count, (currentValue, preValue) => {
    console.log(currentValue, preValue);
});
</script>

<template>
  <h1>ref: {{ count }}</h1>
  <button @click="count++">ref 증가</button>
</template>

<style>

</style>