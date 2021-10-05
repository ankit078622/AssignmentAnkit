package com.spring.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.JpaRepositories.CartItemRepository;
import com.spring.demo.model.CartItem;
import com.spring.demo.service.CartItemService;
@Service
public class CartItemServiceImpl implements CartItemService{

	@Autowired
	CartItemRepository cartItemRepository;
	
	@Override
	public CartItem addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		CartItem addcartItem=cartItemRepository.save(cartItem);
		return addcartItem;
	}

	@Override
	public ArrayList<CartItem> listOfCartItem() {
		// TODO Auto-generated method stub
		ArrayList<CartItem> listofcartitem=(ArrayList<CartItem>) cartItemRepository.findAll();
		return listofcartitem;
	}

	@Override
	public CartItem updateCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		CartItem updatecartItem=cartItemRepository.save(cartItem);
		return updatecartItem;
	}

	@Override
	public void deleteCartItemById(Integer id) {
		// TODO Auto-generated method stub
		cartItemRepository.deleteById(id);		
	}

}
