import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import { createPinia } from 'pinia'
import Router from './router'

const pinia = createPinia()

const app = createApp(App)
app.use(pinia).use(ElementPlus).use(Router).mount('#app')
