package com.spring.demo.service;

import java.util.ArrayList;

import com.spring.demo.model.SalesOrder;

public interface SalesOrderService {

	//Add salesOrder
	SalesOrder addSalesOrder(SalesOrder salesOrder);
	
	//List of salesOrder
	ArrayList<SalesOrder> getListOfSalesOrder();
	
	//Update sales order
	SalesOrder updateSalesOrder(SalesOrder salesOrder);
	
	//Delete sales order
	void deleteSalesOrder(Integer id);
}
