package com.example.service;

import org.hibernate.engine.jdbc.spi.InvalidatableWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Walmart;
import com.example.respository.IWalmartRepository;
@Service
public class WalmartServiceImpl implements IWalmartService{

	IWalmartRepository walmartRepository;
	@Autowired
	public void setWalmartRepository(IWalmartRepository walmartRepository) {
	this.walmartRepository = walmartRepository;
}

	@Override
	public void addWalmart(Walmart walmart) {
		walmartRepository.save(walmart);
		
	}

	
	
}
