<script>
export default {
  inject: ['deposit', 'amount'],
}
</script>

<template>
  <h1>{{ deposit }}</h1>
  <h1>{{ amount }}</h1>
</template>