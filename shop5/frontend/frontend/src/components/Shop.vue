<template>
    <div>
          <div class="item">
                <div >
                    <img :src=shop.img alt="">
                  
                </div>
              
                <div class="information-form">
                    <div>
                         <label for="">{{shop.name}}</label>
                    </div>
                   <div>
                        <i class="fa-solid fa-location-dot"></i> {{shop.address}}<a href="">Xem bản đồ</a>
                   </div>
                   <div>
                      <i class="fa-solid fa-phone"></i> Hotline: {{shop.hotline}} 
                   </div>
                   <div>
                        <i class="fa-solid fa-envelope"></i> {{shop.email}}
                   </div>
                   <div>
                        <i class="fa-solid fa-calendar-days"></i> Thời gian hoạt động: {{shop.workingTime}}
                   </div>
                   <div>
                        <i class="fa-solid fa-clock"></i> Giờ mở cửa: {{shop.openingTime}}
                   </div>
                    
                </div>
            </div>
    </div>
</template>

<script>
export default {
    name: 'ShopVue',

  props:{
    shop:Object
  },

   
    methods: {
        
    },
};
</script>

<style  scoped>
     .information-form{
        padding: 10px;
        /* border: 1px solid black; */
        width: 85%;
        margin: 0 25px;
        box-shadow: 0 4px 4px rgb(0 0 0 / 25%);
         border-radius: 8px;
    }
    .item{
        margin: 25px;
    }
</style>