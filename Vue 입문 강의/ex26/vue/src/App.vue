<script>
export default {
  methods: {
    onClick1() {
      const param1 = this.$refs.param1;
      const cnt1 = param1.innerText;
      console.log(cnt1);
    },
    onClick2() {
      const param2 = this.$refs.param2;
      const cnt2 = param2.innerText;
      console.log(cnt2);
    },
  },
}
</script>

<template>
  <h1 ref="param1">Do it now.</h1>
  <h1 ref="param2">Just do it.</h1>
  <button @click="onClick1">클릭1</button>
  <button @click="onClick2">클릭2</button>
</template>