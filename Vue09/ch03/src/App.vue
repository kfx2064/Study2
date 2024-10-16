<script>
export default {
  data() {
    return {
      user: {
        name: 'John',
        age: 20,
        gender: 'male',
      }
    };
  },
};
</script>

<template>
  <h1>user 데이터의 반복 결과</h1>
  <ul>
    <li v-for="(value, key, index) in user" :key="index">
      {{ index }}: {{ key }} : {{ value }}
    </li>
  </ul>
</template>

<style>

</style>
