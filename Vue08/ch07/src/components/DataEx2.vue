<script setup>
import { ref } from 'vue';
const arr1 = ref([10]);
const arr2 = ref([10]);
setTimeout(() => {
    arr1.value = [10, 20];
});
setTimeout(() => {
    arr2.push(20);
});
</script>

<template>
    <h1>arr1 : {{ arr1 }}</h1>
    <h2>arr2 : {{ arr2 }}</h2>
</template>