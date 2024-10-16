<script>
export default {
    mounted() {
        console.log(this.$parent.parentNum);
        console.log(this.$parent.numOddEvent);
        console.log(this.$parent.getParentNum());
    },
}
</script>

<template>
    <h1>ParentChild</h1>
</template>