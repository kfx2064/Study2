<script>
export default {
  data() {
    return {
      krClass: 'blue-color',
      noClass: 'red-color',
    };
  },
}
</script>

<template>
  <h1 v-bind:class="krClass">Hello, world!</h1>
  <br>
  <h1 :class="noClass">Nice, world!</h1>
</template>

<style>
.blue-color {
  color: blue;
}
.red-color {
  color: red;
}
</style>