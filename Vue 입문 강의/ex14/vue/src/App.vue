<script>
export default {
  data() {
    return {
      data: '',
    };
  },
  methods: {
    showData() {
      console.log(`Good day : ${this.data}`);
    },
  },
}
</script>

<template>
  <form id="loginFrm">
    <textarea v-model="data"></textarea>
    <button type="button" @click="showData">클릭</button>
  </form>
</template>