package com.example.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Walmart;
@Repository
public interface IWalmartRepository extends JpaRepository<Walmart,Integer>{
	

}
