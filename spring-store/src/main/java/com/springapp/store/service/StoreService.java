package com.springapp.store.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.store.items.Apple;
import com.springapp.store.items.Bread;
import com.springapp.store.items.Chocolate;
import com.springapp.store.items.Egg;
import com.springapp.store.items.Item;
import com.springapp.store.items.Milk;
import com.springapp.store.repository.AppleRepository;
import com.springapp.store.repository.BreadRepository;
import com.springapp.store.repository.ChocolateRepository;
import com.springapp.store.repository.EggRepository;
import com.springapp.store.repository.MilkRepository;

@Service
public class StoreService {
	
	@Autowired
	EggRepository eggRepository;
	@Autowired
	AppleRepository appleRepository;
	@Autowired
	MilkRepository milkRepository;
	@Autowired
	BreadRepository breadRepository;
	@Autowired
	ChocolateRepository chocolateRepository;
	
	
	public Item addItem(Map<String,Object> map) {
		if(((String)map.get("item-type")).equals("apple")) {
		return (Item) appleRepository.save(new Apple(map));
		}
		
		if(((String)map.get("item-type")).equals("egg")) {
			return (Item) eggRepository.save(new Egg(map));
		}
		
		if(((String)map.get("item-type")).equals("bread")) {
			return breadRepository.save(new Bread());
		}
		
		if(((String)map.get("item-type")).equals("milk")) {
			return milkRepository.save(new Milk());
		}
		
		if(((String)map.get("item-type")).equals("chocolate")) {
			return chocolateRepository.save(new Chocolate());
		}
		
		return null;
		
	}
	
	public List<Item> getItemsOfType(String item_type){
		if(item_type.equals("egg")) {
			List<Egg> eggs = eggRepository.findAll();
			List<Item> items = new ArrayList<>();
			eggs.stream().forEach((egg)-> {items.add((Item) egg);});
			return items;		
		}
			
		if(item_type.equals("apple")) {
			List<Apple> apples = appleRepository.findAll();
			List<Item> items = new ArrayList<>();
			apples.stream().forEach((apple)-> {items.add((Item) apple);});
			return items;		
		}
		return null;
	}
	
	
}
