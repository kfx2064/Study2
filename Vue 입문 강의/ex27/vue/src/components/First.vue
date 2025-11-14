<script>
export default {
  data() {
    return {
      amount: 10000,
      deposit: '잉여금',
    };
  },
  methods: {
    addAmount() {
      this.amount += 10000;
    },
    changeDeposit() {
      this.deposit = '자본금';
    },
  },
}
</script>

<template>
  <h1>{{ deposit }}</h1>
  <h1>{{ amount }}</h1>
</template>
