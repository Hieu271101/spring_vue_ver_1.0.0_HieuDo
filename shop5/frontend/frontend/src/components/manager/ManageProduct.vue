<template>
    <div>
       <LayoutManager>
            <div class="container">
                <div class="card">
                    <div class="card-header">
                        <h2>Danh sach san pham </h2>
                        <router-link to="/manager/product/addproduct"><button>Them san pham</button></router-link>
                    </div>
                   
                    <div class="card-body">
                        <table class="table">
                            <thead class="thead-dark">
                                <tr>
                                    <th>id</th>
                                    <th>Ten san pham</th>
                                    <th>Anh san pham</th>
                                    <th>Gia san pham</th>
                                    <th>So luong san pham</th>
                                    <th>Mo ta</th>
                                    <th>Danh muc</th>
                                    <th>Sua</th>
                                    <th>Xoa</th>
                                </tr>
                            </thead>
                            <tbody>

                                <tr v-for="product in products" :product="product" :key="product.index" >
                                    <th>{{ product.id }}</th>
                                    <th>{{ product.name }}</th>
                                    <th><img class="card-img-top" :src=product.img alt="Card image cap"></th>
                                    <th>{{ product.price }}</th>
                                    <th>{{product.quantity}}</th>
                                    <th>{{ product.description }}</th>
                                    <th>Danh muc</th>
                                    <th>Sua</th>
                                    <th>Xoa</th>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer">
                        <PanigiationVueVue></PanigiationVueVue>
                    </div>
                </div>
            </div>
       </LayoutManager>
    </div>
</template>

<script>
import LayoutManager from './LayoutManager.vue';
import PanigiationVueVue from '../PanigiationVue.vue';

export default {
    name: 'FrontendManageProduct',
    components:{
        LayoutManager,
        PanigiationVueVue,
      
    }
    ,
    data() {
        return {
            products:[]
        };
    },

    mounted() {
        
    },
    async created(){
        this.products=await fetch('http://localhost:9090/products',{
          method:'GET',

        }).then(response=> response.json())
    },

    methods: {
        
    },
};
</script>

<style  scoped>
    .container{
        width: 1200px;
    }
</style>