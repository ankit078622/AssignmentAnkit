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
public class RestOrder {
	OrderService orderService=new OrderService();
	@GetMapping("/myurl")
	public String sayHello() {
		return "hi Welcome to E-Commerce";
	}
	//Retrieve person info using @get method
	@GetMapping("/orderinfo")
	public EOrder getDummyOrder()	{
		EOrder o=new EOrder();// person class object created
		o.setOrder_id(1);
		o.setUser_name("Ankit");
		o.setOrder_item_name("I Phone");
		o.setTotal(40000);
		return o;
	}
	//Retrieve the person information by id
	@GetMapping("/orderinforid/{id}")
	public EOrder getDummyorderById(@PathVariable("id") Integer id)	{
		EOrder o=new EOrder();
		o.setOrder_id(2);
		o.setUser_name("Amit");
		o.setOrder_item_name("TV");
		return o;
	}
	// add the person information POst
    @PostMapping(value = "/insertorderdetails")
	public EOrder insertDummyorder(@RequestBody EOrder order) {
	   return orderService.addorder(order); //calling the service
	}
	//update person info
	@PutMapping("/update")
	public EOrder updateorderInfo(@RequestBody EOrder order) {
	   return orderService.updateorder(order);
	 }
	//get list
	@GetMapping("/getlistoforder")
	public List<EOrder> getDummyorderList() {
	   List<EOrder> listOfPerson=orderService.getAllOrderlist();
	   return listOfPerson;
	}
	//Delete by id
	@DeleteMapping("/deleterecord/{id}")
	public void deleteDummyorder(@PathVariable("id") Integer id) {
	    orderService.deleteorder(id);	
	}

}
