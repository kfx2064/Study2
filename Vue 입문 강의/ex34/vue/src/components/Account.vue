<script>
export default {
  data() {
    return {
      amount: 50000,
      deposit: '예치금',
    };
  },
  computed: {
    logGiven() {
      console.log('배당금 지급');
    },
  },
  methods: {
    shareAmount() {
      const addTotalAmount = this.amount + (this.amount * 0.1);
      console.log("총액 : " + addTotalAmount);
      this.amount = addTotalAmount;
      return this.amount;
    },
  },
}
</script>

<template>
  <h1>{{ deposit }}</h1>
  <h1>{{ amount }}</h1>
</template>