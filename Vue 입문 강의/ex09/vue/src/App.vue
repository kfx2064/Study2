<script>
export default {
  data() {
    return {
      part: true,
    };
  },
}
</script>

<template>
  <p v-show="part">파트가 보입니다.</p>
  <p v-show="!part">파트가 안 보입니다.</p>
</template>