<template>
    <div>
        <h2>관심있는 K-POP 가수?</h2><hr/>
        <ul>
            <CheckboxItem v-for="idol in idols" :key="idol.id" :idol="idol" />
        </ul>
    </div>
</template>

<script>
    import CheckboxItem from './components/CheckboxItem2.vue'
    export default {
        name: "App",
        components: { CheckboxItem },
        data() {
            return {
                idols: [
                    { id: 1, name: "BTS" },
                    { id: 2, name: "Black Pink" },
                    { id: 3, name: "EXO" },
                    { id: 4, name: "ITZY" },
                ]
            }
        }
    }
</script>

<style scoped>

</style>