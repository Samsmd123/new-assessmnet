package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Walmart;
import com.example.service.IWalmartService;

@SpringBootApplication
public class AssesmentProjectApplication implements CommandLineRunner{

	
	IWalmartService walmartService;
	@Autowired
	public void setWalmartService(IWalmartService walmartService) {
		this.walmartService = walmartService;
	}
	public static void main(String[] args) {
		SpringApplication.run(AssesmentProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Walmart walmart=new Walmart("Texas",122);
		walmartService.addWalmart(walmart);
		
	}

}
