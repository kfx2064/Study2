<script>
export default {
    data() {
        return {
            num: 5,
        };
    },
    computed: {
        doubleNum() {
            return this.num * 2;
        },
    },
    methods: {
        increment() {
            this.num++;
        },
    },
}
</script>
<template>
    <h1>{{ num }}</h1>
</template>
<style>
    h1 {
        color: blue;
    }
    p {
        color: green;
    }
</style>