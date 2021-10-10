package com.spring.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;
/**
 * @author ankit.jaisawal
 *
 */
@Entity
@Table(name="Product")
public class Product {

	@Id
	@NotNull
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="manufacturer")
	private String manufacturer;
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="unit")
	private String unit;
	
	
	public Product(String category, String description, String manufacturer, String name, String price, String unit) {
		super();
		this.category = category;
		this.description = description;
		this.manufacturer = manufacturer;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}

	public Product() {
		
	}
	
	//Getters and setters method
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPrice() {
		return price;
	}

	public String getUnit() {
		return unit;
	}
			
}
