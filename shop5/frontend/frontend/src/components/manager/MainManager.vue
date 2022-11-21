<template>
    <header class="app-header">
      <!-- Sidebar toggle button-->
      <a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        <!-- User Menu-->
        <li>
          <a class="app-nav__item" href="/index.html">
            <i class="fa-solid fa-arrow-right-from-bracket"></i>
          </a>
        </li>
      </ul>
    </header>
  
    <div>
      <aside class="app-sidebar">
        <div class="app-sidebar__user">
          <img class="app-sidebar__user-avatar" src="/images/hay.jpg" width="50px" alt="User Image" />
          <div>
            <p class="app-sidebar__user-name"><b>Võ Trường</b></p>
            <p class="app-sidebar__user-designation">Chào mừng bạn trở lại</p>
          </div>
        </div>
        <hr />
        <ul class="app-menu">
          <li>
            <a class="app-menu__item haha" href="phan-mem-ban-hang.html">
              <i class="app-menu__icon bx bx-cart-alt"></i>
              <span class="app-menu__label">POS Bán Hàng</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item active" href="index.html">
              <i class="app-menu__icon bx bx-tachometer"></i>
              <span class="app-menu__label">Bảng điều khiển</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="table-data-table.html">
              <i class="app-menu__icon bx bx-id-card"></i>
              <span class="app-menu__label">Quản lý nhân viên</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="#">
              <i class="app-menu__icon bx bx-user-voice"></i>
              <span class="app-menu__label">Quản lý khách hàng</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="table-data-product.html">
              <i class="app-menu__icon bx bx-purchase-tag-alt"></i>
              <span class="app-menu__label">Quản lý sản phẩm</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="table-data-oder.html">
              <i class="app-menu__icon bx bx-task"></i>
              <span class="app-menu__label">Quản lý đơn hàng</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="table-data-banned.html">
              <i class="app-menu__icon bx bx-run"></i>
              <span class="app-menu__label">Quản lý nội bộ</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="table-data-money.html">
              <i class="app-menu__icon bx bx-dollar"></i>
              <span class="app-menu__label">Bảng kê lương</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item " href="quan-ly-bao-cao.html">
              <i class="app-menu__icon bx bx-pie-chart-alt-2"></i>
              <span class="app-menu__label">Báo cáo doanh thu</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="page-calendar.html">
              <i class="app-menu__icon bx bx-calendar-check"></i>
              <span class="app-menu__label">Lịch công tác</span>
            </a>
          </li>
          <li>
            <a class="app-menu__item" href="#">
              <i class="app-menu__icon bx bx-cog"></i>
              <span class="app-menu__label">Cài đặt hệ thống</span>
            </a>
          </li>
        </ul>
      </aside>
  
  
    </div>
    <div class="app-content">
      ok
      <div class="d-flex" id="wrapper">
        <!-- Sidebar-->
        >
  
        <!-- Page content wrapper-->
        <div id="page-content-wrapper">
          <!-- Top navigation-->
  
  
          <!-- Page content-->
          <div class="container-fluid">
            <h1 class="mt-4">Add Products</h1>
           
  
            <form method="post" action="${base}/manager/add-products" modelAttribute="product"
              enctype="multipart/form-data">
  
              <hidden path="id" />
  
              <div class="form-group">
                <label for="category">Category (required)</label>
                <select path="categories.id" class="form-control" id="category">
                  <options items="${categories }" itemValue="id" itemLabel="name" />
                </select>
              </div>
  
              <div class="form-group">
                <label for="title">Title (required)</label>
                <input path="title" autocomplete="off" type="text" class="form-control" id="title" placeholder="Title"
                  required="required"/>
              </div>
  
              <div class="form-group">
                <label for="price">Price (required)</label>
                <input type="number" autocomplete="off" path="price" class="form-control" id="price" placeholder="Price"
                  required="required"/>
              </div>
  
              <div class="form-group">
                <label for="priceSale">Price Sale (required)</label>
                <input type="number" autocomplete="off" path="priceSale" class="form-control" id="priceSale"
                  placeholder="Price sale" required="required"/>
              </div>
  
              <div class="form-group">
                <label for="short_description">Description (required)</label>
                <textarea autocomplete="off" path="shortDes" class="form-control" placeholder="Short Description"
                  id="short_description" rows="3" required="required"></textarea>
                              </div>
                              
                              <div class="form-group">
                                  <label for="detail_description">Details (required)</label>
                                  <textarea autocomplete="off" path="details" class="form-control summernote" id="detail_description" rows="3" required="required"></textarea>
                              </div>
                              
                              <div class="form-group form-check">
                                  <checkbox path="isHot" class="form-check-input" id="isHot" />
                                  <label class="form-check-label" for="isHot">Is Hot Product?</label>
                              </div>
      
                              <div class="form-group">
                                  <label for="fileProductAvatar">Avatar</label> 
                                  <input id="fileProductAvatar" name="productAvatar" type="file" class="form-control-file">
                              </div>
                              
                          
      
                              <div class="form-group">
                                  <label for="fileProductPictures">Picture(Multiple)</label> 
                                  <input id="fileProductPictures" name="productPictures" type="file" class="form-control-file" multiple="multiple">
                              </div>
                              
                          
                              
                              <a href="/admin/list-product" class="btn btn-secondary active" role="button" aria-pressed="true">Back to list</a>
                              <button type="submit" class="btn btn-primary">Save Product</button>
      
                          </form>
  
                      
                  </div>
              </div>
            
          </div>
      </div>
     
          
  </template>
  
  <script>
  export default {
    name: 'VueprojectMainManager',
  
    data() {
      return {}
    },
  
    mounted() { },
  
    methods: {},
  }
  </script>
  
  <style scoped>
  .app-content {
    margin-left: 280px;
    margin-top: 80px;
    /* font-size: 50px; */
  }
  
  
  .app-menu__item {
    position: relative;
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex;
    -webkit-box-align: center;
    -ms-flex-align: center;
    align-items: center;
    border-radius: 0.375rem;
    margin-bottom: 10px;
    padding: 15px 15px;
    font-size: 1.08em;
    border-left: 0px;
    box-shadow: none;
    -webkit-transition: border-left-color 0.3s ease, background-color 0.3s ease;
    -o-transition: border-left-color 0.3s ease, background-color 0.3s ease;
    transition: border-left-color 0.3s ease, background-color 0.3s ease;
    color: white;
    border: 1px solid transparent;
    /* border-bottom: 1px solid #ddd; */
  }
  
  .app-sidebar {
    position: fixed;
    top: 0;
    bottom: 0;
    left: 0;
    padding-top: 20px;
    width: 250px;
    padding-left: 10px;
    padding-right: 10px;
    overflow: auto;
    z-index: 10;
    background: rgb(0, 28, 64);
  }
  
  .app-sidebar__user {
    display: block;
    display: -ms-flexbox;
  
    /* display: flex; */
    /* -webkit-box-align: center; */
    -ms-flex-align: center;
    align-items: center;
    padding: 10px;
    color: white;
    text-align: center;
  }
  
  li {
    display: list-item;
    text-align: -webkit-match-parent;
  }
  
  .haha {
    color: rgb(0, 28, 64) !important;
    background: #ffd43b !important;
    font-weight: 600;
    box-shadow: none !important;
    border: 1px solid;
  }
  
  .app-menu__item.active,
  .app-menu__item:hover,
  .app-menu__item:focus {
    background: #c6defd;
    text-decoration: none;
    color: rgb(22 22 72);
    box-shadow: none;
    border: 1px solid rgb(22 22 72);
  }
  
  .app-menu {
    padding: 5px;
  }
  
  ::-webkit-scrollbar {
    display: none;
  }
  
  ul {
    display: block;
    list-style-type: disc;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    padding-inline-start: 40px;
  }
  
  .app-header {
    position: fixed;
    left: 0;
    right: 0;
    top: 0;
    width: 100%;
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex;
    background-color: rgb(0, 28, 64);
    z-index: 1;
    padding-right: 15px;
    padding-left: 15px;
    justify-content: flex-end;
  }
  
  .app-nav {
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex;
    margin-bottom: 0;
    -webkit-box-pack: end;
    -ms-flex-pack: end;
    justify-content: flex-end;
    text-align: right;
  }
  
  
  .app-nav__item {
  
    display: block;
    padding: 15px;
    line-height: 0px;
    color: rgb(0, 28, 64);
    background: rgb(255, 212, 59);
    -webkit-transition: background-color 0.3s ease;
    -o-transition: background-color 0.3s ease;
    transition: background-color 0.3s ease;
  }
  
  .app-sidebar__user-avatar {
  
    background: white;
    border-radius: 15px;
    width: 70px;
    border: 3px solid white;
    margin-bottom: 10px;
  }
  
  hr {
    margin-top: 10px;
    margin-bottom: 10px;
    border: 0;
    border-top: 1px solid rgb(255 255 255 / 26%);
  }
  </style>
  