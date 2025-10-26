<script>
export default {
    mounted() {
        console.log(this.$parent.parentNum);
        console.log(this.$parent.numOddEven);
        console.log(this.$parent.getParentNum());
    },
}
</script>

<template>
    <h1>ParentChild</h1>
</template>

<style scoped>

</style>