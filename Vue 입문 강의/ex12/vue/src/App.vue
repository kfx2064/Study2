<script>
export default {
  methods: {
    onKeyEvent() {
      alert("이벤트 발생");
    },
  },
}
</script>

<template>
  <input type="text" @keyup.enter="onKeyEvent" />
  <input type="text" @keyup.tab="onKeyEvent" />
  <input type="text" @keyup.delete="onKeyEvent" />
  <input type="text" @keyup.esc="onKeyEvent" />

  <input type="text" @keyup.space="onKeyEvent" />
  <input type="text" @keyup.up="onKeyEvent" />
  <input type="text" @keyup.down="onKeyEvent" />

  <input type="text" @keyup.left="onKeyEvent" />
  <input type="text" @keyup.right="onKeyEvent" />

  <button type="button" @click.left="onKeyEvent">Left</button>
  <button type="button" @click.right="onKeyEvent">Right</button>
  <button type="button" @click.middle="onKeyEvent">Middle</button>
</template>