<script>
export default {
  data() {
    return {
      part: ['alpha', 'bravo', 'charlie'],
      team: {
        name: 'sales',
        member: '5',
        head: 'John',
      }
    };
  },
}
</script>

<template>
  <h1>For문 연습</h1>
  <br>
  <ul>
    <li v-for="(cnt, index) in part" :key="index">
      idx : {{ index }}, contents : {{ cnt }}
    </li>
  </ul>
  <br>
  <ul>
    <li v-for="(cnt, key, idx) in team" :key="idx">
      idx : {{ idx }}, key : {{ key }}, contents : {{ cnt }}
    </li>
  </ul>
</template>