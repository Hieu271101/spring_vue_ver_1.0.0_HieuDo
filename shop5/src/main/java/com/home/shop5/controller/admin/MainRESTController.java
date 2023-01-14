package com.home.shop5.controller.admin;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.shop5.dao.ProductDao;
import com.home.shop5.entities.admin.Product;


@RestController

public class MainRESTController {

    @Autowired
    private ProductDao productDAO;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employees
    // http://localhost:8080/SomeContextPath/employees.xml
    // http://localhost:8080/SomeContextPath/employees.json
    
    @CrossOrigin
    @RequestMapping(value = "/products", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Product> getProducts() {
        List<Product> list = productDAO.getAllEmployees();
        return list;
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empNo}
    // http://localhost:8080/SomeContextPath/employee/{empNo}.xml
    // http://localhost:8080/SomeContextPath/employee/{empNo}.json
    @RequestMapping(value = "/product/{proNo}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Product getEmployee(@PathVariable("proNo") String proNo) {
        return productDAO.getEmployee(proNo);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee
    // http://localhost:8080/SomeContextPath/employee.xml
    // http://localhost:8080/SomeContextPath/employee.json
    @CrossOrigin
    @RequestMapping(value = "/product", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Product addEmployee(@RequestBody Product pro) {

        System.out.println("(Service Side) Creating employee: " + pro.getName());

        return productDAO.addEmployee(pro);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee
    // http://localhost:8080/SomeContextPath/employee.xml
    // http://localhost:8080/SomeContextPath/employee.json
    @RequestMapping(value = "/product", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Product updateEmployee(@RequestBody Product pro) {

        System.out.println("(Service Side) Editing employee: " + pro.getName());

        return productDAO.updateEmployee(pro);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empNo}
    @RequestMapping(value = "/product/{proNo}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("proNo") String proNo) {

        System.out.println("(Service Side) Deleting employee: " + proNo);

        productDAO.deleteEmployee(proNo);
    }

}