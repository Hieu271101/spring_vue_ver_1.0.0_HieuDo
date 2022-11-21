<template>
    <div >
        <div class="cover">
            <!-- <img  style="width:100%;opacity: 0.3;"  src="../assets/cover.png" alt=""> -->
            <div class="orderCheckingBox">
                <label for=""><h1>Tra cứu trạng thái đơn hàng</h1></label>
                <div style="display:flex; ">
                    <input type="text" placeholder="Nhập mã đơn hàng" style="padding:10px; font-size:15px; width:500px"> <button type="button" style="width:50px; background-color:pink; padding:10px"><i class="fa-solid fa-magnifying-glass"></i></button>
                </div>
            </div>
        </div>
    </div>
    
</template>

<script>
export default {
    name: 'OrderCheck',

    data() {
        return {
            
        };
    },

  

    methods: {
        
    },
};
</script>

<style  scoped>
    .cover{
      /* position:relative;
      width: 100%; */
      height: 300px;
    padding: 20px;
    margin-bottom: 40px;
    background-image: url(../assets/cover.png);
    background-size: cover;
    background-position: center ;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    text-align: center;
    max-height: 300px;
    }
    .orderCheckingBox{
        /* position: absolute;
        top: 0;
        left: 0;
      display: flex;
      text-align: center; */
      color: rgba(0, 2, 4, 0.8);
    font-size: 25px;
    line-height: 25px;
        margin-bottom: 20px;
    }
</style>