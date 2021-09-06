package com.tom;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class OrderService {
	static HashMap<Integer, EOrder> orderIdMap = getorderIdMap(); //map list
	public OrderService(){
		super();
		if (orderIdMap==null) {
			orderIdMap=new HashMap<Integer, EOrder>();
			// Creating some objects of order while initializing
			//(Integer order_id,String User_name,String order_item_name,Integer total) {
			EOrder order1=new EOrder(1, "Ram", "Dell 15c", 25000);
			EOrder order2=new EOrder(2, "Ankit", "Redami 11 pro",9000);
			EOrder order3=new EOrder(3, "Abhinav", "Sony 15ci", 22000);

			 //adding map list of collections in java
			orderIdMap.put(1,order1);
			orderIdMap.put(2,order2);
			orderIdMap.put(3,order3);
			}	
	}
	public List<EOrder> getAllOrderlist() {
	List<EOrder> Orderlist = new ArrayList<EOrder>(orderIdMap.values());
	return Orderlist;
	}
	public EOrder getorder(int id) {
	EOrder order = orderIdMap.get(id);
	return order;
	}
	// add order
	public EOrder addorder(EOrder order) {
	order.setOrder_id(getMaxId()+ 1);
	// key , value
	orderIdMap.put(order.getOrder_id(), order); ///logic class
	return order;
	}
	//update
	public EOrder updateorder(EOrder order) {
	if (order.getOrder_id() <= 0)
	return null;
	orderIdMap.put(order.getOrder_id(), order);
	return order;
	 }		
	//delete
	public void deleteorder(Integer id) {
	orderIdMap.remove(id);
	}
	public static HashMap<Integer, EOrder> getorderIdMap() {
	return orderIdMap;
	}
	 //Delete all list 
	public List<EOrder> delAllorderlist() {
	List<EOrder> orderlist = new ArrayList<EOrder>(orderIdMap.values());
	orderlist.subList(0, orderlist.size()).clear();
    System.out.println(orderlist.size());
	return orderlist;
	}
	 // Utility method to get max id for order 
	public static int getMaxId() {
	int max = 0;
	for (int id : orderIdMap.keySet()) {
	if (max <= id)
	max = id;
	 }
	return max;
	}


}
