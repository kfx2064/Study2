<template>
    <div>
        x : <input type="text" v-model.number="state.x" /><br />
        결과 : {{ state.result }}
    </div>
</template>

<script>
import { watch, reactive } from 'vue';

export default {
    name : "Calc6",
    setup() {
        const state = reactive({ x:0, result:0 });
        watch(state, (current, old) => {
            console.log(`${old.x} ==> ${current.x}`)
            state.result = current.x * 2;
        })
        return { state }
    }
}
</script>

<style scoped>

</style>