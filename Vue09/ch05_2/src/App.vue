<script>
import FirstChild from './components/FirstChild.vue';
export default {
  components: {
    FirstChild,
  },
  mounted() {
    const childNum = this.$refs.child.num;
    const childDoubleNum = this.$refs.child.doubleNum;
    console.log(`메서드 호출 전: ${childNum}`);
    console.log(`메서드 호출 전: ${childDoubleNum}`);
  
    this.$refs.child.increment();
    console.log(`메서드 호출 전: ${childNum}`);
    console.log(`메서드 호출 전: ${childDoubleNum}`);
  
  },
}
</script>

<template>
  <FirstChild ref="child" />
</template>

<style scoped>

</style>
