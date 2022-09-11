package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface IProductService {
Product addProduct(Product product);
List<Product> getBrandsByDeptId(int deptId);

List<Product> getByName(int  productId);
}

