<script setup>
import { reactive, ref, watch } from 'vue';
const state = reactive({
    count: 0,
});
watch(() => state.count, 
    (currentValue, prevValue) => {
        console.log(currentValue, prevValue);
});
</script>

<template>
    <h1>ref: {{ state.count }}</h1>
    <button @click="state.count++">ref 증가</button>
</template>