<script>
export default {
  data() {
    return {
      getTeam: 'charlie',
    };
  },
  methods: {
    showData() {
      console.log(this.getTeam);
    },
  },
}
</script>

<template>
  <form id="loginFrm">
    <select v-model="getTeam">
      <option value="alpha">alpha</option>
      <option value="bravo">bravo</option>
      <option value="charlie">charlie</option>
    </select>
    <button type="button" @click="showData">클릭</button>
  </form>
</template>