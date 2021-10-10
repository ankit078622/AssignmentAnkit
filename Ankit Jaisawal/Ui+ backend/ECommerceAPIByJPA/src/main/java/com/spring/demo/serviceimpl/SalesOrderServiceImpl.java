package com.spring.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.JpaRepositories.SalesOrderRepository;
import com.spring.demo.model.SalesOrder;
import com.spring.demo.service.SalesOrderService;
@Service
public class SalesOrderServiceImpl implements SalesOrderService{

	@Autowired
	SalesOrderRepository salesOrderRepository;
	
	@Override
	public SalesOrder addSalesOrder(SalesOrder salesOrder) {
		// TODO Auto-generated method stub
		SalesOrder addSalesOrder=salesOrderRepository.save(salesOrder);
		return addSalesOrder;
	}

	@Override
	public ArrayList<SalesOrder> getListOfSalesOrder() {
		// TODO Auto-generated method stub
		ArrayList<SalesOrder> listOfSalesOrder=(ArrayList<SalesOrder>) salesOrderRepository.findAll();
		return listOfSalesOrder;
	}

	@Override
	public SalesOrder updateSalesOrder(SalesOrder salesOrder) {
		// TODO Auto-generated method stub
		SalesOrder updatesalesOrder=salesOrderRepository.save(salesOrder);
		return updatesalesOrder;
	}

	@Override
	public void deleteSalesOrder(Integer id) {
		// TODO Auto-generated method stub
		salesOrderRepository.deleteById(id);		
	}

}
