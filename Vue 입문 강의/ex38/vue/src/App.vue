<script>
import Account from '@/components/Account.vue';
export default {
  components: {
    Account,
  },
}
</script>

<template>
  <Account>
    <template #location>
      <h1>대전</h1>
    </template>
    <template #deposit>
      <h1>자본금</h1>
    </template>
    <template #amount>
      <h1>30000</h1>
    </template>
  </Account>
</template>