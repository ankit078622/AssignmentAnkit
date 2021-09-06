package com.tom;

public class EOrder {
	private Integer order_id;
	private String User_name;
	private String order_item_name;
	private Integer Total;
	public EOrder(){
	super();
	}
	//Parameterized Constructor
	public EOrder(Integer order_id,String User_name,String order_item_name,Integer total) {
		super();
		this.order_id=order_id;
		this.User_name=User_name;
		this.order_item_name=order_item_name;
		this.Total=total;
		
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getOrder_item_name() {
		return order_item_name;
	}
	public void setOrder_item_name(String order_item_name) {
		this.order_item_name = order_item_name;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	
}
