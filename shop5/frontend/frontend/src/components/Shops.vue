<template>
    <div>
        <div class="cover">
            <div class="box">
                <label for=""><h1>Danh sách cửa hàng</h1></label>
                <div style="display: flex">
                    <input type="text" placeholder="nhập địa chỉ cửa hàng hoặc tên cửa hàng" style="padding:10px; font-size:15px; width:500px"> <button type="button" style="width:50px; background-color:pink; padding:10px"><i class="fa-solid fa-magnifying-glass"></i></button>
                </div>
            </div>
        </div>
    <div style="padding: 30px 50px 30px 50px">
        <div class="grid  grid-cols-2">
           
           <ShopVue :shop="shop" v-for=" shop in shops" :key="shop.index"> </ShopVue>     
        </div>
    </div>
       
    </div>
</template>

<script>
    import  ShopVue  from "../components/Shop.vue";
export default {
    
    name: 'ShopsVue',

    data() {
        return {
            shops:[],
        };
    },
    created(){
        this.shops=[
            {
        img:'https://upload.lixibox.com/system/store/information/images/000/000/001/original/1649237668.jpeg',
        name:'Phạm Ngọc Thạch',
        address: '16 Phạm Ngọc Thạch, phường 6, quận 3, TP.HCM',
        hotline:'02838293052',
        email:'phamngocthach.store@lixibox.com',
        workingTime:'Tất cả các ngày trong tuần',
        openingTime:'08:30 - 21:30'
      },
       {
        img:'https://upload.lixibox.com/system/store/information/images/000/000/001/original/1649237668.jpeg',
        name:'Phạm Ngọc Thạch',
        address: '16 Phạm Ngọc Thạch, phường 6, quận 3, TP.HCM',
        hotline:'02838293052',
        email:'phamngocthach.store@lixibox.com',
        workingTime:'Tất cả các ngày trong tuần',
        openingTime:'08:30 - 21:30'
      },

        ]
    },
    components:{
        ShopVue
    },

//    props:{
//         shops:Array
//    },

    methods: {
        
    },
};
</script>

<style  scoped>
    .cover{
          height: 300px;
          padding: 20px;
          margin-bottom: 40px;
        background-image: url(../assets/cover.png);
        background-size: cover;
        background-position: center;
       
        display: flex;
        flex-direction: column;

        justify-content: center;
        align-items: center;
        text-align: center;
    }
    .box{
         font-size: 25px;
          line-height: 25px;
        margin-bottom: 20px;
    }
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