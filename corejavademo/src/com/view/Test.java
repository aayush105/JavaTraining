package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		add();
		getAll();
//		delete();
	}
	

	// add product
	static void add() {
		char flag = 'y';
		
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		do {
			Product p = new Product();
			
			System.out.println("Enter id:");
			p.setId(sc.nextInt());
			
			System.out.println("Enter the name:");
			p.setName(sc.next());
			
			System.out.println("Enter the price:");
			p.setPrice(sc.nextInt());
			
			System.out.println("Enter the company:");
			p.setCompany(sc.next());
			
			System.out.println("Enter the quantity:");
			p.setQty(sc.nextInt());
			
			ps.addProduct(p);
			
			System.out.println("Do you want to add more [y/n]?");
			flag = sc.next().charAt(0); // only tale the first character of the word i.e nepal => n
			
		}while(flag == 'y');
		
}
	
	//get all product
	
	static void getAll() {
		ProductService ps = new ProductServiceImpl();
		List<Product> plist = ps.getAllProducts();
		System.out.println(plist);
	}
	
	//delete product
	static void delete() {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductServiceImpl();
		
		ps.deleteProduct(0);
	}
	/*
	 * 1> XAMPP + sqlYog community
	 *	 or 
	 *2> MySqlWorkBench 
	 */
	
	
}