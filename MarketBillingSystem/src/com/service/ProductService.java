package com.service;

import java.util.List;


import com.model.Product;


public interface ProductService {

	boolean addProduct(Product p);
	boolean updateProduct(Product p);
	Product getProductById(int pid);
	List<Product> getsAllProducts();
	List<Product> searchProduct(String data);	
	
}
