<script>
export default {
  data() {
    return {
      location: '서울 동작구',
      unit: 5,
    };
  },
}
</script>

<template>
  <slot name="alpha" :pLocation="location"></slot>
  <slot name="bravo" :pUnit="unit"></slot>
</template>