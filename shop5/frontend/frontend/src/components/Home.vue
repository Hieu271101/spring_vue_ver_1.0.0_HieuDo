<template>
    <div>
    <!-- <router-view/> -->
    
              <BodyVue  :topProductList="topProductList" :products="listProducts"></BodyVue>
             

           
   
    </div>
</template>

<script>


import BodyVue from './Body.vue'

export default {
    name: 'VueprojectHome',
    components: {
         BodyVue,
   
},
    data() {
    return {
      listShop:[],
      listProducts:[],
      topProductList:[]
    }
  },
    
    methods: {
        
    },
    created(){
  

    this.listProducts=[
      {
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
         {
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
        {
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
        {
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
        {
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
        {
        img:'https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
    ],
   
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
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
       {
        id:'3',
        img:'https://upload.lixibox.com/system/pictures/files/000/069/737/square/1646278981.jpg?t=1657126586 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
       {
        id:'4',
        img:'https://upload.lixibox.com/system/pictures/files/000/068/021/square/1642047471.jpg?t=1657126307 ',
        title:'Kiin',
        description:'Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml',
        price:'126.000 đ',
      },
      
    ]
  }
};
</script>

<style lang="scss" scoped>

</style>