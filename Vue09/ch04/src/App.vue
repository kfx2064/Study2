<script>
export default {
  data() {
    return {
      output: null,
      prev: null,
      cur: null,
      operator: null,
      operatorActions: {
        '+': (a, b) => a + b,
        '-': (a, b) => a - b,
        '*': (a, b) => a * b,
        '/': (a, b) => a / b,
      },
    };
  },
  methods: {
    clear() {
      this.output = null;
      this.prev = null;
      this.cur = null;
      this.operator = null;
    },
    calculate(n) {
      if(!this.cur && !this.prev) {
        alert('숫자를 먼저 입력해 주세요.');
        return
      }

      if (this.operator !== '' && !this.cur) {
        alert('연산 기호를 연속해서 누를 수 없습니다.');
        return;
      }

      if (n === '=' && this.prev == this.cur) {
        return;
      }

      this.cur = Number(this.cur);

      if (this.operator !== null) {
        this.prev = this.operatorActions[this.operator](this.prev, this.cur);

        if (n === '=') {
          this.output = this.prev;
          this.operator = null;
          this.cur = this.prev;
        } else {
          this.output = null;
          this.operator = n;
          this.cur = null;
        }
      } else {
        this.output = null;
        this.operator = n;
        this.prev = this.cur;
        this.cur = null;
      }
    },
    userInput(n) {
      this.cur = this.cur === null ? n : (this.cur += n);
      this.output = this.cur;
    },
    operation(e) {
      const n = e.currentTarget.value;

      if (n === 'C') {
        this.clear();
      } else if (['+', '-', '*', '/', '='].includes(n)) {
        this.calculate(n);
      } else {
        this.userInput(n);
      }
    },
  },
}
</script>

<template>
  <div class="calculator">
    <form name="forms">
      <input type="text" name="output" v-model="output" readonly />
      <input type="button" class="clear" value="C" @click="operation" />
      <input type="button" class="operator" value="/" @click="operation" />
      <input type="button" value="1" @click="operation" />
      <input type="button" value="2" @click="operation" />
      <input type="button" value="3" @click="operation" />
      <input type="button" class="operator" value="*" @click="operation" />
      <input type="button" value="4" @click="operation" />
      <input type="button" value="5" @click="operation" />
      <input type="button" value="6" @click="operation" />
      <input type="button" class="operator" value="+" @click="operation" />
      <input type="button" value="7" @click="operation" />
      <input type="button" value="8" @click="operation" />
      <input type="button" value="9" @click="operation" />
      <input type="button" class="operator" value="-" @click="operation" />
      <input type="button" class="dot" value="." @click="operation" />
      <input type="button" value="0" @click="operation" />
      <input type="button" class="operator result" value="=" @click="operation" />
    </form>
  </div>
</template>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background-color: #ffffff;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.calculator {
  width: 287px;
  border: 1px solid #333;
  background-color: #ccc;
  padding: 5px;
}

.calculator form {
  display: grid;
  grid-template-columns: repeat(4, 65px);
  grid-auto-rows: 65px;
  grid-gap: 5px;
}

.calculator form input {
  border: 2px solid #333;
  cursor: pointer;
  font-size: 19px;
}

.calculator form input:hover {
  box-shadow: 1px 1px 2px #333;
}

.calculator form .clear {
  background-color: #ed4848;
}

.calculator form .operator {
  background-color: orange;
}

.calculator form .dot {
  background-color: green;
}

.calculator form input[type='text'] {
  grid-column: span 4;
  text-align: right;
  padding: 0 10px;
}

.calculator form .clear {
  grid-column: span 3;
}

.calculator form .result {
  grid-column: span 2;
}
</style>
