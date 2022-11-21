package com.home.shop5.entities.admin;

import java.math.BigDecimal;

import com.home.shop5.entities.BaseEntity;



public class Product extends BaseEntity {
	private String name;
	private String description;
	private BigDecimal price;
	
	
	public Product(String name, String description, BigDecimal price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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