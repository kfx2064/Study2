<script>
import First from '@/components/First.vue';

export default {
  components: {
    First,
  },
  methods: {
    chngDepo() {
      this.$refs.first.changeDeposit();
    },
    addAmt() {
      this.$refs.first.addAmount();
    },
  },
}
</script>

<template>
  <First ref="first" />
  <button type="button" @click="chngDepo">속성 변경</button>
  <button type="button" @click="addAmt">추가금</button>
</template>