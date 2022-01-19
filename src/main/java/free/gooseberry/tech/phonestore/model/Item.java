package free.gooseberry.tech.phonestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue
	private int id;
	private String itemName;
	private String itemDescripption;
	private double price;

	@ManyToOne
	private Category category;
	@ManyToOne
	private Brand brand;
	
	@ManyToOne
	private ItemInventory inventory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescripption() {
		return itemDescripption;
	}

	public void setItemDescripption(String itemDescripption) {
		this.itemDescripption = itemDescripption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
}
