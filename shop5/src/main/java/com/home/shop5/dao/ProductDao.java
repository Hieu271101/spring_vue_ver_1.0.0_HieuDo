package com.home.shop5.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.home.shop5.entities.admin.Product;



@Repository
public class ProductDao {
	  private static final Map<String, Product> empMap = new HashMap<String, Product>();
	  
	  static {
	        initEmps();
	    }
	  private static void initEmps() {
	        Product emp1 = new Product("1","Kiin", "https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522",
	        		5,"Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml", 
	        		BigDecimal.valueOf(126000));
	        Product emp2 = new Product("2","Re:p","https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522" ,
	        		6,"Mặt Nạ Đất Sét Thu Nhỏ Lỗ Chân Lông Cấp Ẩm Chiết Xuất Cây Hương Thảo Re:p Bio Fresh Mask With Real Nutrition Herbs 130g",
	        		BigDecimal.valueOf(710000));
	        Product emp3 = new Product("3","Re:p", "https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522",
	        		7,"Kem Giảm Rạn Da Làm Săn Chắc Và Mờ Sẹo Re:p Natural Herb Ultra Firming Stretch Cream 200ml", 
	        		BigDecimal.valueOf(760000));
	        Product emp4 = new Product("4","DHC", "https://upload.lixibox.com/system/pictures/files/000/073/261/square/1654829019.jpg?t=1656905522",
	        		8,"Viên Uống Rau Củ DHC Perfect Vegetable Premium Japanese Harvest 15 Ngày (520mg X 60 Viên)", 
	        		BigDecimal.valueOf(155000));
	        
	        empMap.put(emp1.getId(), emp1);
	        empMap.put(emp2.getId(), emp2);
	        empMap.put(emp3.getId(), emp3);
	        empMap.put(emp4.getId(), emp4);
	    }
	  
	  public Product getEmployee(String empNo) {
	        return empMap.get(empNo);
	    }

	    public Product addEmployee(Product emp) {
	        empMap.put(emp.getName(), emp);
	        return emp;
	    }

	    public Product updateEmployee(Product emp) {
	        empMap.put(emp.getName(), emp);
	        return emp;
	    }

	    public void deleteEmployee(String empNo) {
	        empMap.remove(empNo);
	    }

	    public List<Product> getAllEmployees() {
	        Collection<Product> c = empMap.values();
	        List<Product> list = new ArrayList<Product>();
	        list.addAll(c);
	        return list;
	    }
}
