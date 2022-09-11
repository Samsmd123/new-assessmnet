package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Department;
import com.example.model.Product;
import com.example.model.Walmart;
import com.example.service.IDepartmentService;
import com.example.service.IProductService;
import com.example.service.IWalmartService;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication

public class AssesmentProjectApplication implements CommandLineRunner{

	
	IWalmartService walmartService;
	@Autowired
	public void setWalmartService(IWalmartService walmartService) {
		this.walmartService = walmartService;
	}
	
	
	@Autowired
	IDepartmentService departmentService;
	
	@Autowired
	IProductService productService;
	public static void main(String[] args) {
		SpringApplication.run(AssesmentProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Walmart walmart=new Walmart("Texas",122);
				Walmart walmart2=new Walmart("Dalas",120);
				Walmart walmart3=new Walmart("Guternburg to dc",172);
				/*
				 * walmartService.addWalmart(walmart); walmartService.addWalmart(walmart2);
				 * walmartService.addWalmart(walmart3);
				 */
				
				/*
				 * walmartService.updateWalmart(walmart3);
				 * 
				 * 
				 * Department department=new Department(101,"HealthCare",50.0,"silvercards");
				 * //departmentService.addDepartment(department);
				 * 
				 * Department department2=new Department(102,"Furniture",60.0,"GoldenCard");
				 * //departmentService.addDepartment(department2);
				 * departmentService.updateDepartmnt(department2);
				 * 
				 * 
				 */
				
				/*
				 * Product product=new Product(300,101,"LipBalm",250.0,"Lakme");
				 * productService.addProduct(product);
				 * 
				 * Product product2=new Product(401,101,"Foundation",650.0,"Maybeline");
				 * productService.addProduct(product2);
				 * 
				 * Product product3=new Product(201,102,"Table",9050.0,"IKEA Furniture");
				 * productService.addProduct(product3);
				 */
				
				/*
				 * List<Product> products = productService.getBrandsByDeptId(101);
				 * 
				 * products.forEach(product -> { System.out.println(product.getProductId()+
				 * " - "+product.getBrand()); });
				 */
				List<Product> products=productService.getByName(201);
					products.forEach(product->{System.out.println(product.getProductName());});
				
						
				
	
	}
}
	
	


