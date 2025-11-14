import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'

const app = createApp(App);
app.provide('globalDeposit', '본사관리계좌');
app.provide('globalAmount', 500000);
app.mount('#app');
