<script>
export default {
  data() {
    return {
      deposit: '예치금',
      amount: 50000,
    };
  },
}
</script>

<template>
  <slot :parentDeposit="deposit" :parentAmount="amount"></slot>
</template>