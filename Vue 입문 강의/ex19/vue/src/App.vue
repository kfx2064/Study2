<script>
export default {
  data() {
    return {
      team: '',
      write: '',
      part: 'sales',
      unit: 5,
    };
  },
  methods: {
    changeEvent($event) {
      this.write = $event.target.value;
    },
    selectEvent($event) {
      if (this.part === 'sales') {
        this.unit = 5;
      }
      if (this.part === 'tech') {
        this.unit = 7;
      }
    },
  }
}
</script>

<template>
  <input type="text" v-model="team">
  {{ team }}
  <br>
  <input type="text" @input="changeEvent($event)" />
  {{ write }}
  <br>
  <select v-model="part" @change="selectEvent">
    <option value="sales">영업부</option>
    <option value="tech">기술부</option>
  </select>
  인원 : {{ unit }}
</template>