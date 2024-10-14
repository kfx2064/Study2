<script>
export default {
    methods: {
        parentEventCall() {
            this.$emit('print-hello', { name: '철수', age: 30 });
        },
    },
}
</script>
<template>
    <button @click="parentEventCall">클릭</button>
</template>