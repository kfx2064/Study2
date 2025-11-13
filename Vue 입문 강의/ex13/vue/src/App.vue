<script>
export default {
  data() {
    return {
      userid: '',
      //userid: 'jth',
      userpw: '',
    };
  },
  methods: {
    check() {
      console.log(`id: ${this.userpw}, pw: ${this.userpw}`);
    },
  },
}
</script>

<template>
  <form id="loginFrm">
    <label for="userid">
      아이디 : <input type="text" id="userid" v-model="userid" />
    </label>
    <label for="userpw">
      비밀번호 : <input type="text" id="userpw" v-model="userpw" />
    </label>
    <button type="button" @click="check">로그인</button>
  </form>
</template>