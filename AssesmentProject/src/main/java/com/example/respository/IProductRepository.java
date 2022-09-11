package com.example.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
	
 
	@Query("SELECT p FROM Product p WHERE p.deptId = ?1")
	List<Product> findBrandsByDeptId(int deptId);
	
	@Query(value="select product_name from product where product. product_id=?1",nativeQuery = true)
	List<Product> findByName(int  productId);
}
