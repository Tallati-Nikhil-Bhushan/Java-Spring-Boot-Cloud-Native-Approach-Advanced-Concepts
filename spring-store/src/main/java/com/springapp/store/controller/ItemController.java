package com.springapp.store.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.store.items.Item;
import com.springapp.store.service.StoreService;

@RestController
@RequestMapping("api/v1")
public class ItemController {

	
	@Autowired
	StoreService service;
	@PostMapping("/item")
	public Item addItem(@RequestBody HashMap<String, Object> map) {
				
		return service.addItem(map);
		
	}
	
	@GetMapping("/items/{item_type}")
	public List<Item> getItems(@PathVariable String item_type){
		return service.getItemsOfType(item_type);
	}
}
