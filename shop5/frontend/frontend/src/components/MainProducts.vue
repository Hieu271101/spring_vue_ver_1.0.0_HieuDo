<template>
    <div class="container">
     <div class="row">
        
      <div class="display">
            <!-- <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="../assets/1648631992.png" alt="Card image cap">
              <div class="card-body">
                  <h5 class="card-title">Card title</h5>
                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  <p></p>
                 <a href="" class="btn btn-primary">Go somewhere</a>
              </div>
            </div> -->
          <MainProduct :product="product" v-for="product in products" :key="product.index"></MainProduct>
      </div>
        
    </div>

    <div class="row">
      <PanigiationVue></PanigiationVue>
    </div>
    
  </div>


  
  
</template>

<script>
import PanigiationVue from './PanigiationVue.vue';
import MainProduct from "../components/MainProduct.vue";
export default {
    name: 'VueprojectMainProducts',

    data() {
        return {
            
        };
    },
    components:{
       PanigiationVue,
       MainProduct
    },
    props:{
      products:Array
    },

};
</script>

<style  scoped>
      .display{
      /* width: 1200px; */
      display: flex;
      max-width: 1300px;
      min-width: 100px;
      margin: auto;
      flex-wrap: wrap;
      
      /* border: 1px solid black; */
    }
    .card{
      margin: 30px 10px 30px 10px;
    
    
    }
    .row{
      border-radius: 10px;
     
      margin-bottom: 30px;
    }
</style>