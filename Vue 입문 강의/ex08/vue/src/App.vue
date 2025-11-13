<script>
export default {
  data() {
    return {
      part: "alpha",
      //part: "bravo",
    };
  },
};
</script>

<template>
  <p v-if="part === 'alpha'">파트는 alpha.</p>
  <p v-if="part === 'bravo'">파트는 bravo.</p>
  <p v-if="part === 'charlie'">파트는 charlie.</p>
</template>