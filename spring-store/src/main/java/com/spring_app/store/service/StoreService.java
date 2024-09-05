package com.spring_app.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_app.repository.StoreRepository;
import com.spring_app.store.items.Item;

@Service
public class StoreService {
	
	@Autowired
	StoreRepository repository;
	public Item addItem() {
		
		
		return null;
	}
}
