<script>
export default {
  methods: {
    dataEvent() {
      alert("이벤트 발생");
    },
    eventClick(event) {
      console.log(event);
    }
  },
}
</script>

<template>
  <button type="button" v-on:click="dataEvent">클릭1</button>
  <button type="button" @click="dataEvent">클릭2</button>
  <button type="button" @dblclick="dataEvent">클릭3</button>
  <button type="button" @click="eventClick($event)">클릭4</button>
</template>