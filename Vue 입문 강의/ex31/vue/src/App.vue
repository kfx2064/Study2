<script>
import account from '@/components/account.vue';
export default {
  components: {
    account,
  },
  methods: {
    addAmount(deposit, amount) {
      alert(`${deposit}, ${amount}`);
    },
  },
}
</script>

<template>
  <account @add-amount="(deposit, amount) => addAmount(deposit, amount)" />
</template>