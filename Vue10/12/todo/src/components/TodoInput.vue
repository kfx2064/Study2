<script>
export default {
    data() {
        return {
            inputMsg: '',
        };
    },
    emits: ["addTodo"],
    methods: {
        addTodo() {
            this.$emit('addTodo', this.inputMsg);
            this.inputMsg = "";
        }
    }
}
</script>


<template>
    <div class="todo__input">
        <input 
                v-model="inputMsg"
                type="text" 
                class="todo__input-text" 
                placeholder="할 일을 입력하세요." />
        <button class="todo__input-btn" @click="addTodo">등록</button>
    </div>
</template>