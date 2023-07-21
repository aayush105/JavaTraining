package com.service;

import java.util.List;

import com.model.Bill;


public interface BillService {

	boolean addBill(Bill b);
	boolean removeBill(int sid);
	Bill getProductById(int pid);
	List<Bill> getsBillProducts();
	
}
