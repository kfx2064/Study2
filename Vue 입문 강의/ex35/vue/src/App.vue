<script>
import Account from '@/components/Account.vue';
export default {
  components: {
    Account,
  },
  data() {
    return {
      deposit: '예치금',
      amount: 20000,
    };
  },
  methods: {
    shareAmount() {
      const divide = this.amount * 0.1;
      this.amount = this.amount - divide;
      return divide;
    },
  },
}
</script>

<template>
  <Account />
</template>