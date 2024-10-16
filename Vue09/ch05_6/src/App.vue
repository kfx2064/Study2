<script>
import CustomButton from './components/CustomButton.vue';
import DefaultLayout from './components/DefaultLayout.vue';
export default {
  components: {
    CustomButton,
    DefaultLayout,
  },
}
</script>

<template>
  <DefaultLayout>
    <template v-slot:header>
      <header>
        <h1>Header</h1>
      </header>
    </template>
    <template v-slot:main>
      <main>
        <h1>Main</h1>
      </main>
    </template>
    <template v-slot:footer>
      <footer>
        <h1>Footer</h1>
      </footer>
    </template>
  </DefaultLayout>
</template>

<style>

</style>
