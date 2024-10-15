<script setup>
import { useCountSetupStore } from '@/stores/countSetup';
const setupStore = useCountSetupStore();
console.log(setupStore.num);
console.log(setupStore.doubleNum);
setupStore.increment();

setupStore.getJSON('https://jsonplaceholder.typicode.com/posts');

</script>

<template>
  <h1>About View</h1>
</template>

<style>

</style>
