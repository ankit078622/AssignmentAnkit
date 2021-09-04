package com.tom;

public class Product {

	private Integer product_id;
	private String Product_name;
	private String Product_Model_Number;
	private String Specifications;
	
	//Constructor
	public Product(){
	super();
	}
	//Parameterized Constructor
	public Product(Integer product_id,String Product_name,String Product_Model_Number,String Specifications) {
		super();
		this.product_id=product_id;
		this.Product_name=Product_name;
		this.Product_Model_Number=Product_Model_Number;
		this.Specifications=Specifications;
	}
	
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public String getProduct_Model_Number() {
		return Product_Model_Number;
	}
	public void setProduct_Model_Number(String product_Model_Number) {
		Product_Model_Number = product_Model_Number;
	}
	public String getSpecifications() {
		return Specifications;
	}
	public void setSpecifications(String specifications) {
		Specifications = specifications;
	}
	
}
