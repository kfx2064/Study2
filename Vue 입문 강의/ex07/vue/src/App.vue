<script>
export default {
  data() {
    return {
      agree: true,
      cancel: false,
    };
  },
};
</script>

<template>
  <p v-if="agree">Hello.</p>
  <p v-if="cancel">Hi.</p>
</template>