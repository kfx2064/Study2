<script>
import First from '@/components/First.vue';
export default {
  components: {
    First,
  },
  data() {
    return {
      show: true,
    };
  },
  created() {
    setTimeout(() => {
      this.show = false;
    }, 2000);
  },
}
</script>

<template>
  <First v-if="show" />
</template>