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
	        Product emp1 = new Product("Kiin", 
	        		"Gel Bôi Sát Khuẩn Vùng Nướu Dành Cho Răng Viêm Nha Chu Loét Miệng PERIO KIN 30ml", 
	        		BigDecimal.valueOf(126000));
	        Product emp2 = new Product("Re:p", 
	        		"Mặt Nạ Đất Sét Thu Nhỏ Lỗ Chân Lông Cấp Ẩm Chiết Xuất Cây Hương Thảo Re:p Bio Fresh Mask With Real Nutrition Herbs 130g",
	        		BigDecimal.valueOf(710000));
	        Product emp3 = new Product("Re:p",
	        		"Kem Giảm Rạn Da Làm Săn Chắc Và Mờ Sẹo Re:p Natural Herb Ultra Firming Stretch Cream 200ml", 
	        		BigDecimal.valueOf(760000));
	        Product emp4 = new Product("DHC",
	        		"Viên Uống Rau Củ DHC Perfect Vegetable Premium Japanese Harvest 15 Ngày (520mg X 60 Viên)", 
	        		BigDecimal.valueOf(155000));

	        empMap.put(emp1.getName(), emp1);
	        empMap.put(emp2.getName(), emp2);
	        empMap.put(emp3.getName(), emp3);
	        empMap.put(emp4.getName(), emp4);
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
