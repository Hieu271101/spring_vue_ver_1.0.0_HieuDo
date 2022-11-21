<template>
    <VueprojectNav></VueprojectNav>
   
   <div class="container">
        <div class="row" id="row">
                  <div class="col-sm-2">
                       <div  class="logo">
                            <router-link to="/body">Lixibox</router-link>
                       </div>
                   </div>

              <div class="col-sm-7">
                  <div class="search-bar">
                          
                           <input style="padding: 10px;padding-left: 25px;border-radius: 9px; width: 100%; padding-right: 100px; border: 0.1px solid black; position: absolute;left: 0;" type="text" placeholder="Tìm kiếm">
                           <button style="padding: 10px; border-radius: 0px 9px 9px 0;border: 0.1px dotted black ;position: absolute;right: 0" class="btn-search"><i class="fa-solid fa-magnifying-glass fa-sm"></i>     Tìm kiếm</button>
            
                  </div>
              </div>
                <div class="col-sm-2">
                           <div class="register" style="padding:10px">
                                 <!-- <a href="">Đăng nhập/Đăng kí</a> -->
                                 <router-link to="/register">Đăng nhập/Đăng kí</router-link>
                                    
                             </div>
                </div>
           <div class="col-sm-1">
                  <div class="cart" style="padding:10px">
                         <!-- <a href=""> <i class="fa-solid fa-cart-shopping fa-xl"></i> </a> -->
                        <router-link to="/goodsincart"><i class="fa-solid fa-cart-shopping fa-xl"></i></router-link>
                 </div>
           </div>
          
        </div>
          
    </div>
      
        <div class="line2">
            <div class="container">
                      <nav>
                <ul class="menu">
                    <li class="dropdown"><a href="" > 
                         SHOP BEAUTY   </a>
                        <div class="dropdown-content">
                          
                                <label for=""><a href="">Mua theo box</a> </label>
                           
                            <div >
                                 <a href="">Box mới nhất</a>
                                <a href="">  Box bán chạy nhất</a>
                                <a href="">  Box trang điểma</a>
                                <a href="">  Box dưỡng daa</a>
                                <a href="">  Box trị mụna</a>
                                <a href="">  Box Mẹ & Bé</a>
                                <a href="">  Box Chăm Sóc Răng Miệng</a>
                                <a href="">  Box Chăm Sóc Sức Khỏe</a>
                            </div>

                               <label for=""><a href="">Mua theo box</a> </label>
                           
                          
                          
                               
                      </div>
                    </li>
                    <li><a href="">  SHOP MẸ VÀ BÉ  </a></li>
                    <li><a href="">  ƯU ĐÃI  </a></li>
                    <li><a href="">  THƯƠNG HIỆU  </a></li>
                    <li><a href="">  GIỚI THIỆU BẠN BÈ  </a></li>
                    <li><a href="">  MAGAZINE</a></li>
                    <li><a href=""> <i class="fa-brands fa-youtube fa-xl"></i> FEED  </a></li>

                </ul>

            </nav>
            </div>
          
        </div>
   
</template>

<script>
import VueprojectNav from './Nav.vue';
export default {
    name: 'MainNav',

    data() {
        return {
            
        };
    },
    components:{
        VueprojectNav
    }


};
</script>

<style  scoped>
    .dropdown{
        position: relative;
        display: inline-block;
      
    }
    .dropdown-content{
        padding: 10px;
         width: 100%;
        line-height: 40px;
        display: none;
        position: absolute;
        z-index: 1;
        background-color: white;
    }
    .dropdown:hover .dropdown-content{
        display: block;
    } 
    .logo{
        
    display: flex;
    align-items: center;
    justify-content: center;
    width: 140px;
    height: 100%;
    margin: 0px;
    color: rgb(0, 2, 4);
    font-size: 30px;
    }
    a{
        text-decoration: none;
        color: black;
    }
    #row{
         padding: 30px 50px 30px 50px;
    }
    .search-bar{
         /* border: 1px solid black; */
         position: relative;
         
    }
  
    
    .line2{
     
        padding: 30px 120px 30px 120px;
    }
    
    .menu{
        
        display: flex;
        justify-content: space-around;
    }
    
</style>