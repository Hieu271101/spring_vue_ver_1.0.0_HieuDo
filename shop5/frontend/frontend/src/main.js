// import { createApp } from 'vue'
// import App from './App.vue'

// createApp(App).mount('#app')
import { createApp } from 'vue'
// import { createRouter } from 'vue-router'
import { createStore } from 'vuex'
import App from './App.vue'
import router from './routes'
import storeConfigs from './store/index'
const app=createApp(App)
const store=createStore(storeConfigs)
app.use(router)
app.use(store)
// createApp(App).mount('#app')
app.mount('#app')



