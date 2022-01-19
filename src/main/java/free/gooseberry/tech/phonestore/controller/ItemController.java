package free.gooseberry.tech.phonestore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import free.gooseberry.tech.phonestore.model.Brand;
import free.gooseberry.tech.phonestore.model.Item;
import free.gooseberry.tech.phonestore.service.BrandService;
import free.gooseberry.tech.phonestore.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService service;
	
	@Autowired
	private BrandService brandService;
	
	
	@GetMapping("/items")
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>();
		service.getAllItems().forEach(result::add);
		return result;
	}
	
	@GetMapping("/brands")
	public List<Brand> getAllBranda() {
		return brandService.getAllAvailableBrands();
	}
}
