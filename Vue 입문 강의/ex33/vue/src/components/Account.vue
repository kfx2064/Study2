<script>
export default {
  inject: ['globalDeposit', 'globalAmount'],
}
</script>

<template>
  <h1>{{ globalDeposit }}</h1>
  <h1>{{ globalAmount }}</h1>
</template>