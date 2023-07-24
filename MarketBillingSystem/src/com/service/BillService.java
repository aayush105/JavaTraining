package com.service;

import java.util.List;

import com.model.Bill;
import com.model.Product;


public interface BillService {

	boolean addBill(Bill b);
	boolean removeBill(int bid);
	
	List<Bill> getsBillProducts();
	List<Bill> searchBill(String data);
	Bill getBillById(int bid);	
}
