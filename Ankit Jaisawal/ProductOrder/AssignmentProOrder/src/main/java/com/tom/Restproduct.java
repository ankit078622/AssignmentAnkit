package com.tom;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Restproduct {
	
	ECommerceService ecommerceser=new ECommerceService();
	//Get call using spring based web service
	@GetMapping("/myurl")
	public String sayHello() {
		return "hi Welcome to E-Commerce";
	}
	//Retrieve person info using @get method
	@GetMapping("/productinfo")
	public Product getDummyProduct()	{
		Product p=new Product();// person class object created
		p.setProduct_id(1);
		p.setProduct_name("Mobile");
		p.setProduct_Model_Number("Redmi 9");
		p.setSpecifications("4 GB Ram,64 GB Internal");
		return p;
	}
	//Retrieve the person information by id
	@GetMapping("/productinforid/{id}")
	public Product getDummyProductById(@PathVariable("id") Integer id)	{
		Product p=new Product();
		p.setProduct_id(2);
		p.setProduct_name("TV");
		p.setProduct_Model_Number("Sony 15 A");
		p.setSpecifications("Full Hd Display");
		return p;
	}
	// add the person information POst
    @PostMapping(value = "/insertproductdetails")
	public Product insertDummyProduct(@RequestBody Product product) {
	   return ecommerceser.addProduct(product); //calling the service
	}
	//update person info
	@PutMapping("/update")
	public Product updateProductInfo(@RequestBody Product product) {
	   return ecommerceser.updateProduct(product);
	 }
	//get list
	@GetMapping("/getlistofproduct")
	public List<Product> getDummyProductList() {
	   List<Product> listOfPerson=ecommerceser.getAllProductlist();
	   return listOfPerson;
	}
	//Delete by id
	@DeleteMapping("/deleterecord/{id}")
	public void deleteDummyProduct(@PathVariable("id") Integer id) {
	    ecommerceser.deleteProduct(id);	
	}
    

}
