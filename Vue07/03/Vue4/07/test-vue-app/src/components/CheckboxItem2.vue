<template>
    <li>
        <input type="checkbox" :checked="idol.checked" /> {{ idol.name }}
    </li>
</template>

<script>
    export default {
        name : "CheckboxIem2",
        props : ["idol"],
    }
</script>

<style scoped>

</style>