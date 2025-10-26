<script setup>
import { defineProps } from 'vue';
const emit = defineEmits(['count-increment', 'state-count-increment']);
const increment = () => {
    emit('count-increment');
};
</script>

<template>
    <button @click="increment">count 증가</button>
    <button @click="emit('state-count-increment')">state.count 증가</button>
</template>