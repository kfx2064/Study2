<script>
export default {
  data() {
    return {
      team: 'alpha',
    };
  },
  methods: {
    showData() {
      console.log(this.team);
    },
  },
}
</script>

<template>
  <form id="loginFrm">
    <input type="radio" id="alpha" name="alpha" value="alpha" v-model="team" />alpha
    <input type="radio" id="bravo" name="bravo" value="bravo" v-model="team" />bravo
    <button type="button" @click="showData">클릭</button>
  </form>
</template>