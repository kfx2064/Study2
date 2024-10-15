<script setup>
import { reactive, ref, watchEffect } from 'vue';
const count = ref(0);
const state = reactive({ count: 0 });
watchEffect(() => {
    console.log(count.value);
    console.log(state.count);
});
</script>

<template>
    <h1>ref: {{ count }}</h1>
    <button @click="count++">ref 증가</button>
    <h1>reactive: {{ state.count }}</h1>
    <button @click="state.count++">ref 증가</button>
</template>