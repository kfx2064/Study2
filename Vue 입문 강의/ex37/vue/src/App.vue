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
    <template v-slot:location>
      <h1>서울</h1>
    </template>
    <template v-slot:deposit>
      <h1>예치금</h1>
    </template>
    <template v-slot:amount>
      <h1>20000</h1>
    </template>
  </Account>
</template>