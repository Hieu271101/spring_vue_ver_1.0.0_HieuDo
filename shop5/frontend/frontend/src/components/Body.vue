<template>
    <LayoutVue>
  <div>
      <div class="row">
         <div class="col-sm-11" style="margin: auto; margin-bottom: 30px; ">
             <img style="border-radius: 8px;" src="../assets/1654675936.jpg" alt="">
         </div>
      </div>

        <TopProducts @direct-to-cart="display" :products="topProductList"></TopProducts>
    
        <VueprojectFilter></VueprojectFilter>
      
        <MainProductsVue :products="products"></MainProductsVue>
      

    </div>

    </LayoutVue>
  
</template>

<script>
import TopProducts from '../components/TopProducts.vue'
import MainProductsVue from '../components/MainProducts.vue'
import LayoutVue from '../components/Layout.vue';
import VueprojectFilter from '../components/Filter.vue'
export default {
    name: 'BodyVue',
      components: {
  
    TopProducts,
    MainProductsVue,
    
    VueprojectFilter,
   LayoutVue
},

    data() {
        return {
             topProductList:[],
             products:[]
        };
    },
   async created(){
//     this.posts= await fetch('http://localhost:9090/products',{
//      method:'GET',
//      headers:{
//          // 'Access-Control-Allow-Origin': '*',
//  //    'Access-Control-Allow-Origin':'http://localhost:8080/products'
     
//      }
   
//  })
// .then(response => response.json());

        this.products=await fetch('http://localhost:9090/products',{
          method:'GET',

        }).then(response=> response.json())
        
    //     [
    //   {
    //     img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
    //     title:'Kiin',
    //     description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
    //     price:'126.000 đ',
    //   },
    //      {
    //     img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
    //     title:'Kiin',
    //     description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
    //     price:'126.000 đ',
    //   },
    //     {
    //     img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
    //     title:'Kiin',
    //     description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
    //     price:'126.000 đ',
    //   },
    //     {
    //     img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
    //     title:'Kiin',
    //     description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
    //     price:'126.000 đ',
    //   },
    //     {
    //     img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
    //     title:'Kiin',
    //     description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
    //     price:'126.000 đ',
    //   },
    //     {
    //     img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
    //     title:'Kiin',
    //     description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
    //     price:'126.000 đ',
    //   },
    // ]
    ,
   
        this.topProductList=[
      { id:'1',
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
       {
        id:'2',
        img:'https://upload.lixibox.com/system/pictures/files/000/069/645/square/1646108147.png?t=1657126588',
        title:'Re:p',
        description:'Mặt Nạ Đất Sét Thu Nhỏ Lỗ Chân Lông Cấp Ẩm Chiết Xuất Cây Hương Thảo Re:p Bio Fresh Mask With Real Nutrition Herbs 130g',
        price:'710.000 ₫',
      },
       {
        id:'3',
        img:'https://upload.lixibox.com/system/pictures/files/000/069/737/square/1646278981.jpg?t=1657126586 ',
        title:'Re:p',
        description:'Kem Giảm Rạn Da Làm Săn Chắc Và Mờ Sẹo Re:p Natural Herb Ultra Firming Stretch Cream 200ml',
        price:'760.000 ₫',
      },
       {
        id:'4',
        img:'https://upload.lixibox.com/system/pictures/files/000/068/021/square/1642047471.jpg?t=1657126307 ',
        title:'DHC',
        description:'Viên Uống Rau Củ DHC Perfect Vegetable Premium Japanese Harvest 15 Ngày (520mg X 60 Viên)',
        price:'155.000 ₫',
      },
      
    ]
    }
    ,
    props:{
    //   products:Array,
    //   topProductList:Array
      
    },
 

    methods: {
        display(product){
            this.cartData.id=product.id
            this.cartData.img=product.img
            this.cartData.title=product.title
            this.cartData.price=product.price
            // console.log(this.cartData)
            this.$emit('direct-to-cart');

        
        }
    },
};
</script>

<style scoped>
  
</style>