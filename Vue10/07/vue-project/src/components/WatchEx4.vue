<script setup>
import { reactive, watch } from 'vue';
const state = reactive({
    count: 0,
});
watch(state, (currentValue, prevValue) => {
    console.log(currentValue, prevValue);
});
</script>

<template>
    <h1>reactive: {{ state.count }}</h1>
    <button @click="state.count++">ref 증가</button>
</template>