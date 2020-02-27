package com.miestore.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miestore.models.Item;
import com.miestore.repositories.ItemRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ItemsController {

	@Autowired
	private ItemRepository itemRepository;
	
	public ItemsController() {
		super();
	}
	
	@GetMapping("/items")
	public List<Item> getItems(){
		return(List<Item>)itemRepository.findAll();
	}
	
	@PostMapping("/items")
	void addItem(@RequestBody Item item) {
		itemRepository.save(item    );
	}
}
