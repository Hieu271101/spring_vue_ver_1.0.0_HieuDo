<template>
  <div>
    <router-view/>
    <!-- <LayoutVue>
        
         <router-view/>
    </LayoutVue> -->
        
   
  </div>
  <!-- <router-view name="home" /> 
  <router-view/> -->
    <!-- <div>
     
      <MainNav></MainNav>
     
      <BodyVue @direct-to-cart="check" :topProductList="topProductList" :products="listProducts"></BodyVue>
     <router-view name="home"/>
     <RegisterForm></RegisterForm>
     <OrderCheck></OrderCheck>
     <ShopsVue :shops="listShop"></ShopsVue>

    <Cart></Cart>
    <router-link to="/cart"></router-link>
   
     <VueprojectFooter></VueprojectFooter>

    </div> -->
</template>

<script>
// import LayoutVue from './components/Layout.vue'
export default {
  name: 'App',
  components: {
    // LayoutVue
},
  data() {
    return {
      listShop:[],
      listProducts:[],
      topProductList:[]
    }
  },
  methods:{
    check(){
      // console.log(' ')
      // console.log(data)
      console.log('1')
    }
  },
  // created(){
  //   this.listShop=[
  //     {
  //       img:'https://upload.lixibox.com/system/store/information/images/000/000/001/original/1649237668.jpeg',
  //       name:'Phạm Ngọc Thạch',
  //       address: '16 Phạm Ngọc Thạch, phường 6, quận 3, TP.HCM',
  //       hotline:'02838293052',
  //       email:'phamngocthach.store@lixibox.com',
  //       workingTime:'Tất cả các ngày trong tuần',
  //       openingTime:'08:30 - 21:30'
  //     },
  //      {
  //       img:'https://upload.lixibox.com/system/store/information/images/000/000/001/original/1649237668.jpeg',
  //       name:'Phạm Ngọc Thạch',
  //       address: '16 Phạm Ngọc Thạch, phường 6, quận 3, TP.HCM',
  //       hotline:'02838293052',
  //       email:'phamngocthach.store@lixibox.com',
  //       workingTime:'Tất cả các ngày trong tuần',
  //       openingTime:'08:30 - 21:30'
  //     },
     
  //   ],

  //   this.listProducts=[
  //     {
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //        {
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //       {
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //       {
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //       {
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //       {
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //   ],
   
  //  this.topProductList=[
  //     { id:'1',
  //       img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //      {
  //       id:'2',
  //       img:'https://upload.lixibox.com/system/pictures/files/000/069/645/square/1646108147.png?t=1657126588',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //      {
  //       id:'3',
  //       img:'https://upload.lixibox.com/system/pictures/files/000/069/737/square/1646278981.jpg?t=1657126586 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
  //      {
  //       id:'4',
  //       img:'https://upload.lixibox.com/system/pictures/files/000/068/021/square/1642047471.jpg?t=1657126307 ',
  //       title:'Kiin',
  //       description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
  //       price:'126.000 đ',
  //     },
      
  //   ]
  // }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
 
}
</style>
