<template>
    <div>
          <div class="card" style="width: 18rem;">
                <img class="card-img-top" :src=product.img alt="Card image cap">
              <div class="card-body">
                  <h5 class="card-title">{{product.name}}</h5>
                  <p class="card-text">{{product.description}}</p>
                  <p>{{product.price}}</p>
                 <a href="" class="btn btn-primary">Thêm giỏ hàng</a>
              </div>
           </div>
    </div>
</template>

<script>
export default {
    name: 'MainProduct',

    data() {
        return {
            
        };
    },

    props:{
        product:Object
    },
    methods: {
        
    },
};
</script>

<style  scoped>
      .card{
      margin: 30px 10px 30px 10px;
     border-radius: 20px;
      /* border: 1px solid black; */
    }
    .row{
      border-radius: 10px;
     
      margin-bottom: 30px;
    }
</style>