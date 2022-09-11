package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.respository.IProductRepository;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	 IProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	@Override
	public List<Product> getBrandsByDeptId(int deptId) {
		// TODO Auto-generated method stub
		return productRepository.findBrandsByDeptId(deptId);
	}
	@Override
	public List<Product> getByName(int productId) {
		// TODO Auto-generated method stub
		return productRepository.findByName(productId);
	}

}
