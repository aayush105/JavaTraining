package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Product;

public class ProductServiceImpl implements ProductService{

	@Override
	public boolean addProduct(Product p) {
		
		String sql = "Insert into product (pid,pname,available,added,mrp) values (?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setInt(1, p.getPid());
			pstm.setString(2, p.getPname());
			pstm.setInt(3, p.getAvailable());
			pstm.setInt(4, p.getAdded());
			pstm.setFloat(5, p.getMrp());
			
			pstm.execute();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		String sql = "Update product set pid = ?, pname = ?, available = ?, added = ?, mrp = ?";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setInt(1, p.getPid());
			pstm.setString(2, p.getPname());
			pstm.setInt(3, p.getAvailable());
			pstm.setInt(4, p.getAdded());
			pstm.setFloat(5, p.getMrp());
			
			pstm.execute();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Product getProductById(int pid) {
		Product p = new Product();
		
		String sql = "select * from product where pid ="+pid;
		
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				p.setPid(rs.getInt("pid"));
				p.setPname(rs.getString("pname"));
				p.setAvailable(rs.getInt("available"));
				p.setAdded(rs.getInt("added"));
				p.setMrp(rs.getFloat("mrp"));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return p;
	}

	@Override
	public List<Product> getsAllProducts() {
		
		List<Product> plist = new ArrayList<>();
		String sql = "select * from product";
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setPname(rs.getString("pname"));
				p.setAvailable(rs.getInt("available"));
				p.setAdded(rs.getInt("added"));
				p.setMrp(rs.getFloat("mrp"));
			
				plist.add(p);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return plist;

	}

}
