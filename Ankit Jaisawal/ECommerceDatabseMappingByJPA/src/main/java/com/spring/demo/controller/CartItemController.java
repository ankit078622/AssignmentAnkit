package com.spring.demo.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.CartItem;
import com.spring.demo.serviceimpl.CartItemServiceImpl;

/**
 * @author ankit.jaisawal
 *
 */
@RestController
public class CartItemController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CartItemServiceImpl cartItemServiceImpl;
	
	/**
	 * @param cartItem
	 * @return
	 */
	@PostMapping("/addcartitemdetails")
	ResponseEntity<CartItem> addCartItemDetails(@Valid @RequestBody CartItem cartItem) {
		LOGGER.info("inside CartItemController.addCartItemDetails() method");
		CartItem addcartitem=cartItemServiceImpl.addCartItem(cartItem);
		return new  ResponseEntity<CartItem>(addcartitem,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getcartitemdetails")
	ArrayList<CartItem> getUserDetails() {
		LOGGER.info("inside CartItemController.getCartItemDetails() method");
		ArrayList<CartItem> listofcartitem=cartItemServiceImpl.listOfCartItem();
		return listofcartitem;
	}
	
	/**
	 * @param cartItem
	 * @return
	 */
	@PutMapping("/updatecartitemdetails")
	ResponseEntity<CartItem> updateCartItemDetails(@Valid @RequestBody CartItem cartItem) {
		LOGGER.info("inside CartItemController.uupdateCartItemDetails(CartItem cartItem); method");
		CartItem updatecartItem=cartItemServiceImpl.updateCartItem(cartItem);
		return new  ResponseEntity<CartItem>(updatecartItem,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @param id
	 */
	@DeleteMapping("/deletecartitembyid/{id}")
	public void deleteCartItemById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside CartItemController.deleteCartItemById(id) method");
		cartItemServiceImpl.deleteCartItemById(id);
	}
}
