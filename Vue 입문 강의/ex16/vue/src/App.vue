<script>
export default {
  data() {
    return {
      team: ['alpha', 'bravo'],
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
    <input type="checkbox" id="team1" value="alpha" v-model="team" />알파
    <input type="checkbox" id="team1" value="bravo" v-model="team" />브라보
    <input type="checkbox" id="team1" value="charlie" v-model="team" />찰리
    <button type="button" @click="showData">클릭</button>
  </form>
</template>