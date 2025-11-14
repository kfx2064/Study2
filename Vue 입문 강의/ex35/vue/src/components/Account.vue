<script>
export default {
  data() {
    return {
      childDeposit: '',
      childAmount: 0,
      childShareAmt: 0,
    };
  },
  methods: {
    getData1() {
      this.childDeposit = this.$parent.deposit;
      this.childAmount = this.$parent.amount;
      this.childShareAmt = this.$parent.shareAmount();
    },
  },
}
</script>

<template>
  <h1>Account</h1>
  <h1>{{ childDeposit }}</h1>
  <h1>{{ childAmount }}</h1>
  <h1>{{ childShareAmt }}</h1>
  <button type="button" @click="getData1">클릭</button>
</template>