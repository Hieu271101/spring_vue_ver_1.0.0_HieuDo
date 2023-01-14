<template>
    <div>
        <LayoutManagerVue>
            <div class="container">
                <div class="card">
                    <div class="card-header">
                        <h2>Them san pham</h2>
                    </div>
                    <div class="card-body">
                        <form @submit.prevent="createdPost"  method="POST">
                            <div class="form-group">
                                <label for="">Ten san pham</label>
                                <input v-model="formData.name" type="text" name="name" class="form-control">
                            </div>

                            <div class="form-group">
                                <label for="">Anh san pham</label>
                                <input v-model="formData.img" type="text" name="img" class="form-control">
                            </div>

                            <div class="form-group">
                                <label for="">Gia san pham</label>
                                <input v-model="formData.price" type="text" name="price" class="form-control">
                            </div>

                            <div class="form-group">
                                <label for="">So luong san pham</label>
                                <input v-model="formData.quantity" type="number" name="quantity" class="form-control">
                            </div>

                            <div class="form-group">
                                <label for="">Mo ta san pham</label>
                                <input v-model="description" type="text" name="description" class="form-control">
                            </div>

                            <!-- <div class="form-group">
                                <label for="">Thuong hieu san pham</label>
                                <input type="text" name="" class="form-control">
                            </div> -->
                            <button class="btn btn-success" type="submit">Them</button>
                        </form>
                    </div>
                </div>
            </div>
        </LayoutManagerVue>
    </div>
</template>

<script>
import LayoutManagerVue from './LayoutManager.vue';
import axios from 'axios';
export default {
    components:{
        LayoutManagerVue
    },
    name: 'FrontendAddProduct',

    data() {
        return {
            formData:{
                id:'',
                name:'',
                img:'',
                quantity:'',
                description:'',
                price:'',
            }
        };
    },

    mounted() {
        
    },

     methods: {
       async createdPost(){
            await  axios.post('http://localhost:9090/product',this.formData)
            .then((response)=>console.log(response))
            .catch((error)=>console.log(error));
        }
    },
};
</script>

<style  scoped>
    .container{
        width: 1200px;
    }
</style>