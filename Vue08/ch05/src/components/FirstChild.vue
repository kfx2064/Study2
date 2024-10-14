<script>
import { message, reversedMessage } from '@/keys.js';
export default {
    data() {
        return {
            childNum: 0,
        }
    },
    computed: {
        childNumOddAdd() {
            return this.childNum % 2 === 0 ? '짝수' : '홀수';
        },
    },
    methods: {
        getChildNum() {
            return this.childNum;
        },
    },
}
</script>
<template>
    <h1>FirstChild</h1>
</template>
<style>
    
</style>