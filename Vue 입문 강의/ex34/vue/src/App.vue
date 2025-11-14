<script>
import Account from '@/components/Account.vue';
export default {
  components: {
    Account,
  },
  methods: {
    click1() {
      console.log(this.$refs.accountRef.deposit);
      console.log(this.$refs.accountRef.amount);
      this.$refs.accountRef.shareAmount();
    }
  },
}
</script>

<template>
  <Account ref="accountRef" />
  <button type="button" @click="click1">클릭</button>
</template>