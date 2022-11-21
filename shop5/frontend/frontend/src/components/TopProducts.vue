<template>
    <div class="container">
       <div class="row">
          <img style="margin:auto; margin-top:20px ;" src="../assets/ellips.jpg" alt="">
        <div class="display">
              
         <TopProduct @direct-to-cart="cartDataProduct(product)" :product="product" v-for="product in products" :key="product.index" ></TopProduct>
       </div>
      
      </div>
    </div>
    
          
      
  </template>
  
  <script>
  import TopProduct from './TopProduct.vue';
  export default {
      name: 'TopProducts',
  
      data() {
          return {
            
              
          };
      },
      props:{
        products:Array
      },
      components:{
          TopProduct
      },
  
  
      methods: {
          cartDataProduct(product){
              
             this.$emit('direct-to-cart',product)
            //  console.log(this.cartData)
          }
      },
  };
  </script>
  
  <style  scoped>
      .display{
        /* width: 1200px; */
        display: flex;
        justify-content: center;
        max-width: 1300px;
        min-width: 100px;
        margin: auto;
        /* border: 1px solid black; */
        flex-wrap: wrap;
      }
      .card{
        margin: 30px 10px 30px 10px;
        border-radius: 20px;
      }
      .row{
        border-radius: 10px;
        background: rgb(255, 230, 190);
        margin-bottom: 30px;
      }
  </style>