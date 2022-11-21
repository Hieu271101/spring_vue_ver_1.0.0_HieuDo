<template>
   
    <div class="form">
        <div class="login-form">
           <div class="left">
               <div class="background" >
                  
               </div>
               <label style="margin-bottom: 50px; " for=""> 
               <h1>Đăng nhập </h1>
                </label>
               <div style="margin-bottom:30px"> Đăng nhập để mua hàng và sử dụng những tiện ích mới nhất từ www.lixibox.com </div>

               <button class="btn-sigin" type="submit">
                   <i class="fa-brands fa-facebook"></i> <span>Đăng nhập bằng Facebook</span>
               </button>
               <button class="btn-sigin" type="submit">
                   <i class="fa-brands fa-google"></i> <span>Đăng nhập bằng Google</span>
               </button>
               <button class="btn-sigin" type="submit">
                   <i class="fa-brands fa-apple"></i> <span>Đăng nhập bằng Apple</span>
              </button>
           </div>
           <div class="right">
               <div class="line-login">
                    <input type="text" placeholder="Email"> 
               </div>
              
                <div class="line-login">
                    <input type="password" placeholder="Mật khẩu">
                </div>
              

                 <div >
                     <button class="dang-nhap" type="submit">Đăng nhập</button>

                 </div>

                   <div >
                       <a style="width:100%; align-item:center" href="">Quên mật khẩu</a>

                   </div>
             

               
           </div>
       </div>
   </div>
  
  
</template>

<script>

export default {
   name: 'RegisterForm',
   components:{
      
   },
   data() {
       return {
           
       };
   },

  
   methods: {
       
   },
};
</script>

<style  scoped>
.form{
 
   max-width: 2000px;
   min-width: none;
}
.login-form{
       /* border: 1px solid black; */
       display: flex;
      margin: auto;
      
      width: 500px;
      height: 500px;
      /* width: calc(100%/2); */
      align-items: center;
      max-width: 780px;
      flex-wrap: wrap;
      
   }
   .left{
       position: relative;
      /* margin: auto;
       margin-right: 0; */
       border: 1px solid black;
      /* width: 300px; */
      width: calc(100%/2);
      padding: 10px;
       border: 1px solid black;
       border-radius: 8px 0px 0px 8px;
       border-right: none;
   }
   .btn-sigin{
       margin-bottom: 30px;
       border: 1px solid;
       width: 100%;
       padding: 10px;
        border-radius: 8px;
   }
   .line-login{
         margin-bottom: 30px;
     
       width: 100%;
      
   }
   .line-login input{
       padding: 10px;
       border: 1px solid black;
       border-radius: 8px;
   }
   
   
   .right{
     border: none;
       /* margin: auto;
      margin-left: 0; */
       border: 1px groove    black;
       /* width: calc(100%/2); */
     padding: 10px;
       padding-top:  140px;
       padding-bottom: 54px;
       border-radius: 0 8px 8px 0;
        border-left: none;
   }
   .dang-nhap{
      width: 100%;
     height: 45px;
      border-radius: 8px;
      background: rgb(222, 50, 50);
      color: white;
      margin-bottom: 30px;
   }
   .background{
       position: absolute;
       background-image: url(../assets/desktop-signin.png);
       background-size: cover;
       width: 100%;
       height: 100%;
       opacity: 0.3;
       top: 0;
       left: 0;
       z-index: -99;
       border-radius: 8px;
   }
</style>