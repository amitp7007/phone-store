package free.gooseberry.tech.phonestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import free.gooseberry.tech.phonestore.model.Item;
import free.gooseberry.tech.phonestore.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public Iterable<Item> getAllItems(){
		return itemRepository.findAll();
	}
}
