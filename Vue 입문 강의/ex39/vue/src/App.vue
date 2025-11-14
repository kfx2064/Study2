<script>
import Account from '@/components/Account.vue';
import Division from '@/components/Division.vue';
export default {
  components: {
    Account,
    Division,
  },
}
</script>

<template>
  <Account v-slot="slotParam">
    <h1>{{ slotParam.parentDeposit }}</h1>
    <h1>{{ slotParam.parentAmount }}</h1>
  </Account>
  <Division>
    <template #alpha="loParam">
      <h1>{{ loParam.pLocation }}</h1>
    </template>
    <template #bravo="uParam">
      <h1>{{ uParam.pUnit }}</h1>
    </template>
  </Division>
</template>