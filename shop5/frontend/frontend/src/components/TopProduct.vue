<template>
    <div>
         <div class="card" style="width: 18rem;">
                <img class="card-img-top" :src=product.img alt="Card image cap">
              <div class="card-body">
                  <h5 class="card-title">{{product.title}}</h5>
                  <p class="card-text">{{product.description}}</p>
                  <p>{{product.price}}</p>
                 <!-- <a href="."  type="button" class="btn btn-primary" @click="directToCart(product.id)">Đi đến giỏ hàng</a> -->
                    <button class="btn btn-primary" type="button" @click="directToCart">Thêm giỏ hàng</button>    
                   
                 <!-- <button type="button" @click="directToCart">đi đến cart</button> -->
              </div>
          </div>
    </div>
</template>

<script>
import { mapActions, mapGetters, mapMutations } from 'vuex';
export default {
    name: 'TopProduct',

    data() {
        return {
            duLieu:[
                {
                    img:' ',
                    title:'',
                    description:'',
                    price:''
                }
            ],

           
        };
    },
    computed:{
        ...mapGetters(['data'])
    },  
    props:{
        product:Object
    },
   
    methods: {
        directToCart(){
                 this.duLieu.img=this.product.img,
                 this.duLieu.title=this.product.title,
                 this.duLieu.description=this.product.description,
                 this.duLieu.price=this.product.price
                 this.setData(this.duLieu)
                 this.$router.push('/cart')
        },
        // directToCart(product){
      
      
           
        //     this.setData(this.duLieu)
        //     // console.log(this.data);
        //     // console.log(id)
        //     // this.$emit('direct-to-cart',product)

        // },
        
        ...mapActions(['display1']),
        ...mapMutations(['setData']),
        
    },
};
</script>

<style scoped>
     .card{
      margin: 30px 10px 30px 10px;
      border-radius: 20px;
    }
</style>