<script>
export default {
  data() {
    return {
      name: "james",
      gender: "male",
    };
  },
}
</script>

<template>
  <p>나의 이름은 {{ name }}</p>
  <p>나의 성별은 {{ gender }}</p>
</template>