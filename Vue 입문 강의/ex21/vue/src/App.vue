<script>
export default {
  methods: {
    keyupEvent() {
      console.log('키업 이벤트');
    },
  },
}
</script>

<template>
  <input type="text" @keyup="keyupEvent" />
</template>