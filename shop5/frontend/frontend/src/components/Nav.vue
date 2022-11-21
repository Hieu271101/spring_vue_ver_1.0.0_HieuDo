<template>
    <div>
        <nav>
            <div class="row">
                <div class="col-sm-6"><a href="">[Freeship cho tất cả đơn hàng - Nhập mã APPLXBFREESHIP] Khi mua hàng qua Lixibox App</a></div>
                <div class="col-sm-6">
                    <router-link to="/shops"> <i id="icon" class="fa-solid fa-shop"></i>Cửa hàng  </router-link>
                    <router-link to="/ordercheck"><i id="icon" class="fa-solid fa-van-shuttle"></i>Kiểm tra đơn hàng</router-link>
                    <a href=""></a>
                    <a href=""><i id="icon" class="fa-solid fa-coins"></i>Lixicon</a>

                </div>
    
            </div>
        </nav>
    </div>
</template>

<script>
export default {
    name: 'VueprojectNav',

    data() {
        return {
            
        };
    },

    mounted() {
        
    },

    methods: {
        
    },
};
</script>

<style  scoped>
    .col-sm-6{
        background-color: black;
        /* border: 1px solid black; */
        color: white;
        text-align: center;
        padding: 10px;
    }
    a{
        margin-right: 20px;
    }
    #icon{
        margin-right: 10px;
    }
</style>