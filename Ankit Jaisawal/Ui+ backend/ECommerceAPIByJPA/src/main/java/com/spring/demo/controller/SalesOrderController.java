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

import com.spring.demo.model.SalesOrder;
import com.spring.demo.serviceimpl.SalesOrderServiceImpl;

/**
 * @author ankit.jaisawal
 *
 */
@RestController
public class SalesOrderController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SalesOrderServiceImpl salesOrderServiceImpl;
	
	/**
	 * @param salesOrder
	 * @return
	 */
	@PostMapping("/addsalesorderdetails")
	ResponseEntity<SalesOrder> addSalesOrderDetails(@Valid @RequestBody SalesOrder salesOrder) {
		LOGGER.info("inside SalesOrderController.addSalesOrderDetails() method");
		SalesOrder addSalesOrder=salesOrderServiceImpl.addSalesOrder(salesOrder);
		return new  ResponseEntity<SalesOrder>(addSalesOrder,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getsalesorderdetails")
	ArrayList<SalesOrder> getSalesOrderDetails() {
		LOGGER.info("inside SalesOrderController.getSalesOrderDetails() method");
		ArrayList<SalesOrder> listofsalesorder=salesOrderServiceImpl.getListOfSalesOrder();
		return listofsalesorder;
	}
	
	/**
	 * @param salesOrder
	 * @return
	 */
	@PutMapping("/updatesalesorderdetails")
	ResponseEntity<SalesOrder> updateSalesOrderDetails(@Valid @RequestBody SalesOrder salesOrder) {
		LOGGER.info("inside SalesOrderController.updateSalesOrderDetails(SalesOrder salesOrder); method");
		SalesOrder updatesalesorder=salesOrderServiceImpl.updateSalesOrder(salesOrder);
		return new  ResponseEntity<SalesOrder>(updatesalesorder,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @param id
	 */
	@DeleteMapping("/deletesalesorderbyid/{id}")
	public void deleteSalesOrderById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside SalesOrderController.deleteSalesOrderById(id) method");
		salesOrderServiceImpl.deleteSalesOrder(id);
	}
}
