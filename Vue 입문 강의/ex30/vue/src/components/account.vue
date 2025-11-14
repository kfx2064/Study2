<script>
export default {
  methods: {
    parentAddAmount() {
      this.$emit('add-amount');
    },
  },
}
</script>

<template>
  <button type="button" @click="parentAddAmount">클릭</button>
  <button type="button" @click="$emit('add-amount')">인속성</button>
</template>
