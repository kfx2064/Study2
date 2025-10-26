<script setup>
import { ref } from 'vue';
const inputRef = ref(null);
setTimeout(() => {
    console.log(inputRef.value);
    console.log(inputRef.value.innerText);
}, 1000);
</script>

<template>
    <h1 ref="inputRef">Hello, Ref!</h1>
</template>