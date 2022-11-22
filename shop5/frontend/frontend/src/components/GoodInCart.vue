<template>
    <LayoutVue>
 <div>
     
     

     <div class="style-bar">
         <div class="style">
             <i class="fa-solid fa-bag-shopping fa-2xl"></i>1. Giỏ hàng
         </div>
         <div class="style">
             <i class="fa-solid fa-credit-card fa-2xl"></i>2. Thanh toán
         </div>
         <div class="style">
             <i class="fa-solid fa-check fa-2xl"></i>3. Hoàn tất
         </div>
     </div>

     <div class="main-container">
         <div class="title">Giỏ Hàng Của Bạn </div>
    
         <!-- <div class="scroll-view">
             <i class="fa-solid fa-basket-shopping fa-10x" style="margin-top:40px"></i>
             <div style="width:100%;text-align: center;font-size: 25px;margin-top: 35px;" ><label for="">Giỏ hàng trống</label></div>
             <div style="width:100%;text-align: center" >Hãy quay lại và chọn cho mình sản phẩm yêu thích bạn nhé</div>
             <button class="continue-shopping"   type="button"> Tiếp tục mua sắm</button>
         </div> -->
         <div class="box">
             <div class="left">
                 <div class="item">
                     <div class="img" style="width:70px;height: 70px; margin-right: 20px;">
                         <img style="width:100%" src="https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522" alt="">
                     </div>
                     <div class="content">
                         <div class="name" style="margin-bottom:10px">
                                 Ví Cầm Tay Chữ Nhật Coeur Clarity Wristlet - Deep Black
                         </div>
                         <div class="price" style="margin-bottom:10px">
                             280.000 ₫
                         </div>
                         <div class="row-item" >
                             <div class="count" >
                                  <div class="minor">
                                       <button class="btn-count" type="button" @click="minor">-</button>
                                  </div>
                                    <div class="num">
                                       {{count}}
                                    </div>
                                    <div class="plus">
                                      <button class="btn-count" type="button" @click="plus"> +</button>
                                    </div>
                             </div>
                          
                             <div class="delete" style="margin-right:10px">
                                 <i class="fa-solid fa-trash-can"></i>
                             </div>
                         </div>
                     </div>
                 </div>
             </div>

             <div class="right">
                 <div class="line1">
                     <button type="button" class="bymore" > Mua thêm</button>
                     <button type="button" class="bymore" style="background-color: rgb(238, 107, 107);">Đặt hàng</button>
                 </div>
                 <div class="line2">
                     <div style="width:100%">
                          <i class="fa-solid fa-percent"></i>   Mã giảm giá
                     </div>
                 
                     <input style="border:1px solid grey; padding:10px; width:100%;border-radius:8px" type="text" placeholder="Mã giảm giá">
                 </div>
                 <div class="line3">
                     <div>
                         <div>Tiền hàng</div> 
                     </div>
                     <div>
                         <div>Lixicoin nhận được</div>
                     </div>
                     <div>
                         <div style="border-top:1px solid grey">Tạm tính</div>
                     </div>
                 </div>
                
                
             </div>
         </div>
     </div>
 </div>
</LayoutVue>
</template>

<script>
import LayoutVue from '../components/Layout.vue';

export default {
 name: 'GoodInCart',
 components: {


LayoutVue
},
 data() {
     return {
         count:1,
         posts: []
     };
 },
 async created() {
 
   
 this.posts= await fetch('http://localhost:9090/products',{
     method:'GET',
     headers:{
         // 'Access-Control-Allow-Origin': '*',
 //    'Access-Control-Allow-Origin':'http://localhost:8080/products'
     
     }
   
 })
.then(response => response.json());




},


 methods: {
     plus(){
         this.count++;
     },
     minor(){
         if(this.count>0){
         this.count--;
         }

     }
 },
};
</script>

<style  scoped>
 *{
   background-color: rgb(245, 246, 246)
 }
 .item{
     border: 1px solid black;
     display: flex;
     margin: 10px;
     margin-top:0;
     border-radius: 3px;
     justify-content: space-around;
     align-items: center;
 }
 .bymore{
     width: 180px;
     border: 1px solid black;
     border-radius: 9px;
     height: 40px;
 }
 .style{
     display: flex;
     align-items: center;
     width: 150px;
     justify-content: space-around;
     font-size: 17px;
     margin: 15px;
 }
 .style-bar{
     width: 100%;
     margin: auto;
     display: flex;
     /* border: 1px solid black; */
     justify-content: center;
     margin-bottom: 40px;
 
 }
 .main-container{
     display: flex;
     margin: auto;
     max-width: 800px;
     justify-content: center;
      /* border: 1px solid black; */
      flex-wrap: wrap;
      /* margin-bottom: 40px; */
      padding-bottom: 40px;
 }
 .title{
     /* border: 1px solid black; */
     
     width: 100%;
     font-size: 25px;
     margin-bottom: 25px;
 }
 .scroll-view{
     /* border: 1px solid black; */
     display: flex;
     flex-wrap: wrap;
     justify-content: center;
     line-height: 40px;
     box-shadow:  0px 0px 5px 5px #9f8b8b;;
 }
 .continue-shopping{
     /* border: 1px solid black; */
     background-color: black;
     color: white;
     width: 200px;
     border-radius: 9px;
     margin-top: 40px;
     margin-bottom: 40px;
 }
 .box{
     /* border: 1px solid black; */
     display: flex;
   
 }
 .left{
     /* border: 1px solid black; */
     min-width: 800px;
 }
 .right{
     /* border: 1px solid black; */
     min-width: 400px;
 }
 .count{
     display: flex;
     justify-content: center;
   
 }
 .row-item{
     display: flex;
     justify-content: space-between;
 }
 .btn-count{
     width: 25px;
     background-color: black;
     color: white;
     margin-left: 10px;
     margin-right: 10px;
 }
 .right{
     display: flex;
     flex-wrap: wrap;
     margin-left: 20px;
 }
 .line1{
     /* padding: 10px; */
     display: flex;
     justify-content: space-between;
     /* border: 1px solid black; */
     width: 100%;
     /* padding: 10px; */
     margin-bottom: 15px;
      border-radius: 7px;
 }
  .line2{
     /* height: 300px; */
     border: 1px solid black;
        width: 100%;
        display: flex;
        flex-wrap: wrap;
        padding: 10px;
        margin-bottom: 15px;
        border-radius: 7px;
 }
  .line3{
      border-radius: 7px;
     /* height: 300px; */
     border: 1px solid black;
        width: 100%;
        padding: 10px;
 }
 



</style>