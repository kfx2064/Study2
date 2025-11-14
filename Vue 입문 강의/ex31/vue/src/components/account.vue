<script>
export default {
  emits: ['add-amount'],
  methods: {
    parentAddAmount() {
      this.$emit('add-amount', '예치금', 1000);
    },
  },
}
</script>

<template>
  <button type="button" @click="parentAddAmount">클릭1</button>
  <button type="button" @click="$emit('add-amount', '잉여금', 2000)">클릭2</button>
</template>
