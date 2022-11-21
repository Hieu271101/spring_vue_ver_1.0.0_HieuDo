<template>
    <div style="width:100%">
        <!-- <div class="row">
                <div class="col-sm-3">
                    <h1>LIXOBOX</h1>
                </div>
                 
                 <div class="col-sm-3">
                    <h2>Danh mục sản phẩm</h2>
                 </div>
                
                <div class="col-sm-3">
                    <h2>Thông tin & Hướng dẫn</h2>
                </div>
                
                <div class="col-sm-3">
                    <h2>Tải ứng dụng LIXIBOX</h2>
                </div>

        </div> -->
 <div style="padding: 30px 120px 30px 120px;" class=" grid grid-cols-4 gap-4 content-start ...">
  <div>
    <div style="margin-bottom:40px" ><h1>LIXIBOX</h1> </div>
    <div>www.lixibox.com là kênh mua sắm mỹ phẩm, làm đẹp hàng đầu Việt Nam được các beauty blogger lựa chọn để giới thiệu sản phẩm họ yêu thích tới khách hàng, người hâm mộ.</div>
  </div>
  
  <div>
    <div  style="margin-bottom:40px"><h1>Danh mục Sản phẩm</h1> </div>
    <div>
        <ul>
            <li><a href="">Beauty Box   </a></li>
            <li><a href="">Trang điểm   </a></li>
            <li><a href="">Tóc          </a>      </li>
            <li><a href=""> Dưỡng da    </a>     </li>
            <li><a href="">Cơ thể       </a>      </li>
            <li><a href="">Cọ & phụ kiện </a>     </li>
            <li><a href="">Shop mẹ và bé</a>      </li>

            
        </ul>
    </div>
  </div>
  
  
  <div>
    <div  style="margin-bottom:40px"><h1>Thông tin & Hướng dẫn</h1> </div>
    <div>
        <ul>
            <li><a href=""> Về Lixibox   </a></li>
            <li><a href=""> Mời bạn bè- nhận thưởng ngay   </a></li>
            <li><a href=""> HDSD & Bảo hành   </a></li>
            <li><a href=""> Hỗ trợ đơn hàng   </a></li>
            <li><a href=""> Cửa hàng Lixibox   </a></li>
            <li><a href="">  Hướng dẫn đặt hàng   </a></li>
            <li><a href=""> Phương thức đặt hàng   </a></li>
            <li><a href=""> Chính sách đổi trả   </a></li>
            <li><a href=""> Chính sách bảo mật   </a></li>
            <li><a href=""> Điều khoản sử dụng   </a></li>
            
        </ul>
    </div>
  </div>
  
  
  
  <div>
    <div  style="margin-bottom:40px"><h1>Tải ứng dụng LIXIBOX</h1> </div>
    
    <div class="download-row">
        <div><a href=""><img src="../assets/ios-app.png" alt=""></a></div>
        <div><a href=""><img src="../assets/android-app.png" alt=""></a></div>
     </div>

     <div class="hotline">
        <a href=""> <h1>Hotline: 1800 2040</h1></a>
     </div>

     <div class="icon-contact">
        <i class="fa-brands fa-facebook fa-2xl"></i>
        <i class="fa-brands fa-instagram fa-2xl"></i>
        <i class="fa-brands fa-youtube fa-2xl"></i>
        <i class="fa-brands fa-facebook-messenger fa-2xl"></i>
     </div>
  </div>
  
</div>


    </div>
</template>

<script>
export default {
    name: 'VueprojectFooter',

    data() {
        return {
            
        };
    },
};
</script>

<style  scoped>
    *{
        background-color: black;
        color: white;
    }
    .row{   
        padding: 30px 120px 30px 120px;
    }
    .download-row{
        display: flex;
        justify-content: space-between;
    }
    .icon-contact{
        display: flex;
        justify-content: space-between;
        margin-top: 30px;
    }
    h1{
        font-size: 25px;
    }
    li{margin-bottom: 10px;}
</style>