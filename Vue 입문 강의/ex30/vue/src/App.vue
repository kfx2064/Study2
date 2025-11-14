<script>
import account from '@/components/account.vue';
export default {
  components: {
    account,
  },
  methods: {
    addAmount() {
      alert("추가 입금!");
    },
  },
}
</script>

<template>
  <account @add-amount="addAmount" />
</template>