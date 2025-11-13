<script>
export default {
  data() {
    return {
      contents: "<h1>Hello, world!</h1>"
    };
  },
}
</script>

<template>
  <div>{{ contents }}</div>
  <div v-html="contents"></div>
  <div v-text="contents"></div>
  <div v-pre>{{ contents }}</div>
</template>