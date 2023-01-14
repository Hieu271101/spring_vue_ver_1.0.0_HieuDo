package com.home.shop5.entities.admin;

import java.math.BigDecimal;

import com.home.shop5.entities.BaseEntity;



public class Product extends BaseEntity {
	private String id;
	private String name;
	private String img;
	private int quantity;
	private String description;
	private BigDecimal price;
	
	
	
	
	
	
	public Product(String id, String name, String img, int quantity, String description, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.quantity = quantity;
		this.description = description;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
