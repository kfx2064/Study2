<script>
export default {
  data() {
    return {
      alpha: true,
      bravo: false,
    };
  },
}
</script>

<template>
  <form id="loginFrm">
    <label for="first">
      <input type="checkbox" id="first" v-model="alpha" value="first" />First
    </label>
    <label for="second">
      <input type="checkbox" id="second" v-model="bravo" value="second" />Second
    </label>
  </form>
</template>