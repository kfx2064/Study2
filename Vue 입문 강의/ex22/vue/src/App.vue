<script>
export default {
  data() {
    return {
      team: 'sales',
      leader: 'John',
      alpha: 5,
      bravo: 7,
    };
  },
  computed: {
    teamDetail() {
      return `${this.team} - ${this.leader}`;
    },
    platoonMember() {
      return this.alpha + this.bravo;
    }
  },
}
</script>

<template>
  <h1>{{ teamDetail }}</h1>
  <h1>{{ platoonMember }}</h1>
</template>