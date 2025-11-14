<script>
import account from "@/components/account.vue";
export default {
  components: {
    account,
  },
  data() {
    return {
      deposit: '예치금',
      amount: '20000',
    };
  },
}
</script>

<template>
  <account :deposit="deposit" :amount="amount" />
</template>