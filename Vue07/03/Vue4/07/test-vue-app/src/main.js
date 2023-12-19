import { createApp } from 'vue'
// import App from './App.vue'
import App from './App2.vue'
import CheckboxItem from './components/CheckboxItem.vue'

import './assets/main.css'

createApp(App)
    .component('CheckboxItem', CheckboxItem)
    .mount('#app')
