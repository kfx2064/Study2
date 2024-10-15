<script setup>
import { defineProps } from 'vue';
const props = defineProps({
    count: Number,
    state: [Object, Array],
});
</script>

<template>
    <h1>{{ props.count }}</h1>
    <h1>{{ props.state.count }}</h1>
</template>