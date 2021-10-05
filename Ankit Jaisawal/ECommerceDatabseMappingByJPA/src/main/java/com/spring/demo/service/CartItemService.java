package com.spring.demo.service;

import java.util.ArrayList;

import com.spring.demo.model.CartItem;

public interface CartItemService {

	//Add cartItems
	CartItem addCartItem(CartItem cartItem);
	
	//List of cart item
	ArrayList<CartItem> listOfCartItem();
	
	//Update cartItem
	CartItem updateCartItem(CartItem cartItem);
	
	//Delete cartItem
	void deleteCartItemById(Integer id);
}
