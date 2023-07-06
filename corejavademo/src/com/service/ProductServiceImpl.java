package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;


public class ProductServiceImpl implements ProductService {
	
	static List<Product> plist = new ArrayList<>();
	
	@Override
	public void addProduct(Product prod) {
		
//		plist.add(prod);
//		System.out.println("-----Added success-----size---"+plist.size());
		try {
			// register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// getConnection(url,un.pw)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","Aayush_105");
			
			
			String sql = "insert into product(name,price,company,qty) values('"+prod.getName()+"','"+prod.getPrice()+"','"+prod.getCompany()+"','"+prod.getQty()+"')";
			Statement stm = con.createStatement();
			stm.execute(sql);
			con.close();
			System.out.println("Success");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int id) {
		// plist.remove(index);
		try {
			// register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// getConnection(url,un.pw)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","Aayush_105");
			
			
			String sql = "delete from product where id = "+id+"";
			Statement stm = con.createStatement();
			stm.execute(sql);
			con.close();
			System.out.println("Success");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
//	public List<Product> getAllProducts() {
//		
//		return plist;
//	}

	public void getProduct() {
		try {
			// register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// getConnection(url,un.pw)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","Aayush_105");
			
			
			String sql = "select * from product";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Company: "+rs.getString("company"));
				System.out.println("Price: "+rs.getInt("price"));
				System.out.println("Quantity: "+rs.getInt("qty"));
			}
			System.out.println("Success");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
