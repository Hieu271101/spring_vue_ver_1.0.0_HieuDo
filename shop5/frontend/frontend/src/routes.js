import { createRouter, createWebHistory } from "vue-router";
import CartVue from "./components/Cart.vue";

// import CartVue from "./components/Cart.vue";
import HomeVue from "./components/Home.vue";
import RegisterFormVue from "./components/RegisterForm.vue";
import OrderCheckVue from "./components/OrderCheck.vue";
import ShopsVue from "./components/Shops.vue";
import BodyVue from "./components/Body.vue";
import GoodInCartVue from "./components/GoodInCart.vue";
import MainManager from "./components/manager/MainManager.vue";
import ManageProduct from "./components/manager/ManageProduct.vue";
import Dashboard from "./components/manager/Dashboard.vue";
import AddProduct from "./components/manager/AddProduct.vue";
const routers=[
    {
        path:'/',
        name:'home',
        component:HomeVue,
    },
    {
        path:'/cart',
        name:'cart',
        component:CartVue
    },
    {
        path:'/register',
        name:'register',
        component:RegisterFormVue
    },
    {
        path:'/ordercheck',
        name:'ordercheck',
        component:OrderCheckVue
    },
    {
        path:'/shops',
        name:'shops',
        component:ShopsVue
    },
    {
        path:'/body',
        name:'body',
        component:BodyVue
    },
    {
        path:'/goodsincart',
        name:'goodsincart',
        component:GoodInCartVue
    },
    {
        path:'/manager',
        name:'manager',
        component:MainManager
    },
    {
        path:'/manager/product',
        name:'manageProduct',
        component:ManageProduct
    },
    {
        path:'/manager/dashboard',
        name:'dashboard',
        component:Dashboard
    },
    {
        path:'/manager/product/addproduct',
        name:'addproduct',
        component:AddProduct
    }
   

]

const router=createRouter({
    history:createWebHistory(),
    
    routes:routers
})

export default router