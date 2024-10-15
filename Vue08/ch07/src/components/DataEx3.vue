<script setup>
import { reactive } from 'vue';
const state = reactive({
    count : 0,
});
console.log(state.count);
setTimeout(() => {
    state.count++;
}, 1000);
</script>

<template>
    <h1>state : {{ state.count }}</h1>
</template>