<script>
export default {
  data() {
    return {
      team: 'sales',
      unit: 5,
      location: 'seoul',
    };
  },
  methods: {
    submitEvent(e) {
      e.preventDefault();
      console.log("team : " + this.team);
      console.log("unit : " + this.unit);
      console.log("location : " + this.location);
    },
  },
}
</script>

<template>
  <form @submit="submitEvent">
    <input type="text" id="team" name="team" v-model="team" />
    <input type="text" id="unit" name="unit" v-model="unit" />
    <input type="text" id="location" name="location" v-model="location" />
    <button type="submit">전송</button>
  </form>
</template>