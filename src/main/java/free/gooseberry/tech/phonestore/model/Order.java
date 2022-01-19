package free.gooseberry.tech.phonestore.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Order {
	
	@Id
	@GeneratedValue
	private int id;
	@ManyToMany
	private List<Item> listOfItems = new ArrayList<Item>(); 
	private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Item> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	
}
