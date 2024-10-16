<script>
export default {
  data() {
    return {
      selected: 'banana',
      price: 500,
    };
  },
  methods: {
    onKeyupHandler() {
      console.log(`keyup event!`);
    },
  },
}
</script>
  
<template>
  <input type="text" @keyup="onKeyupHandler" />
</template>

<style scoped>

</style>
