<script>
import account from '@/components/account.vue';
export default {
  components: {
    account,
  },
  provide() {
    return {
      deposit: this.deposit,
      amount: this.amount,
    };
  },
  data() {
    return {
      deposit: '예치금',
      amount: 10000,
    };
  },
}
</script>

<template>
  <account />
</template>