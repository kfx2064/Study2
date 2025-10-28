<script>
import TodoHeader from '@/components/TodoHeader.vue';
import TodoList from '@/components/TodoList.vue';
import TodoInput from '@/components/TodoInput.vue';

export default {
  components: {
    TodoHeader,
    TodoList,
    TodoInput,
  },
  data() {
    return {
      todo: [],
      current: 'all',
    };
  },
  computed: {
    computedTodo() {
      if (this.current === 'all') {
        return this.todo;
      } else {
        return this.todo.filter((v) => v.completed);
      }
    },
  },
  methods: {
    addTodo(inputMsg) {
      const item = {
        id: Math.random(),
        msg: inputMsg,
        completed: false,
      };
      this.todo.push(item);
    },
    updateTab(tab) {
      this.current = tab;
    },
    deleteTodo(id) {
      this.todo = this.todo.filter((v) => v.id !== id);
    },
    updateTodo(id) {
      this.todo = this.todo.map((v) => 
        v.id === id ? { ...v, completed: !v.completed } : v
      );
    }
  },
}
</script>

<template>
    <div class="todo">
      <TodoHeader :current="current" @update-tab="updateTab" />
      <TodoList 
        :computed-todo="computedTodo"
        @delete-todo="deleteTodo"
        @update-todo="updateTodo" />
      <TodoInput @add-todo="addTodo" />  
    </div>
</template>

<style scoped>

</style>
