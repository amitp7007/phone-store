package free.gooseberry.tech.phonestore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import free.gooseberry.tech.phonestore.model.Brand;
import free.gooseberry.tech.phonestore.repository.BrandRepository;

@Service
public class BrandService {

	@Autowired
	private BrandRepository repo;
	
	public List<Brand> getAllAvailableBrands(){
		List<Brand> result = new ArrayList<Brand>();
		for(Brand b: repo.findAll()) {
			result.add(b);
		}
		return result;
	}
}
