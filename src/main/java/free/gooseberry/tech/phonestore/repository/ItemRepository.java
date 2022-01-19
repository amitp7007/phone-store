package free.gooseberry.tech.phonestore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import free.gooseberry.tech.phonestore.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{

}
