package free.gooseberry.tech.phonestore;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import free.gooseberry.tech.phonestore.model.Brand;
import free.gooseberry.tech.phonestore.model.Category;
import free.gooseberry.tech.phonestore.model.Item;
import free.gooseberry.tech.phonestore.repository.BrandRepository;
import free.gooseberry.tech.phonestore.repository.CategoryRepository;
import free.gooseberry.tech.phonestore.repository.ItemRepository;

@SpringBootApplication
public class PhoneStoreApplication  implements ApplicationRunner {

	static Logger log = org.slf4j.LoggerFactory.getLogger(PhoneStoreApplication.class);
	@Autowired
	BrandRepository brepo;

	@Autowired
	CategoryRepository crepo;

	@Autowired
	ItemRepository irepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PhoneStoreApplication.class, args);
	}
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Add brand
		Brand brandIphone = new Brand();
		//brandIphone.setId("1");
		brandIphone.setName("Apple");
		brepo.save(brandIphone);
		
		
		log.info("Infi-----");
		for(Brand b:  brepo.findAll()) {
			log.info(b.getName());
		}
		// add ctegory
		Category c = new Category();
		//c.setId(1);
		c.setName("Smart Phone");
		c.setDescription("Smart Phone");
		crepo.save(c);
		
		Item item = new Item();
		item.setBrand(brandIphone);
		item.setCategory(c);;
		item.setItemDescripption("Appli I phone 13");
		item.setPrice(43999.00);
		irepo.save(item);
		
	}
}
