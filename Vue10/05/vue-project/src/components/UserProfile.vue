<script>
export default {
    methods: {
        parentEventCall() {
            this.$emit('print-hello', '철수', 30);
        }
    },
}
</script>

<template>
    <button @click="$emit('print-hello', '철수', 30)">클릭</button>
</template>
