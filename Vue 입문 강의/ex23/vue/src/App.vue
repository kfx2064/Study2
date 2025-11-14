<script>
export default {
  data() {
    return {
      pushData: '',
      arrData: [2, 4, 6],
      objData: { team: 'alpha' },
    };
  },
  watch: {
    pushData(newVal, oldVal) {
      console.log(`oldVal : ${oldVal}, newVal : ${newVal}`);
    },
    arrData: {
      handler(newVal, oldVal) {
        console.log(`oldVal : ${oldVal}, newVal : ${newVal}`);
      },
      deep: true,
    },
    objData: {
      handler(newVal, oldVal) {
        console.log(`oldVal : ${oldVal}, newVal : ${newVal}`);
      },
      deep: true,
    }
  },
}
</script>

<template>
  <input type="text" v-model="pushData" />
  <p>{{ arrData }}</p>
  <p>{{ objData }}</p>
  <button @click="arrData.push(10)">데이터 추가</button>
  <button @click="objData.team = 'bravo'">객체 변경</button>
</template>