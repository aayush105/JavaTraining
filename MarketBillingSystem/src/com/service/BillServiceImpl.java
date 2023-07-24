package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Bill;

public class BillServiceImpl implements BillService{

	@Override
	public boolean addBill(Bill b) {
		
		String sql = "insert into createbill(bid,cname,pid,pname,mrp,quantity,discount,date,price) values (?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			pstm.setInt(1, b.getBillno());
			pstm.setString(2, b.getCustname());
			pstm.setInt(3, b.getPid());
			pstm.setString(4, b.getPname());
			pstm.setFloat(5, b.getMrp());
			pstm.setInt(6, b.getQuantity());
			pstm.setFloat(7, b.getDiscount());
			
			// Convert java.util.Date to java.sql.Date
            java.util.Date utilDate = b.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            pstm.setDate(8, sqlDate);
			
            float price = (b.getQuantity()*b.getMrp())- b.getDiscount();
            pstm.setFloat(9, price);
            
            pstm.execute();
            return true;
            
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean removeBill(int bid) {
		
		String sql = "delete from createbill where bid = "+bid;
		
		try {
			Statement stm = DB.getConnection().createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}


	@Override
	public Bill getBillById(int bid) {
		
		 Bill b = new Bill();
		    String sql = "SELECT * FROM createbill WHERE bid = " + bid;

		    try {
		        Statement stm = DB.getConnection().createStatement();
		        ResultSet rs = stm.executeQuery(sql);

		        if (rs.next()) {
		            b.setBillno(rs.getInt("bid")); // Assign the billno from the ResultSet
		            b.setCustname(rs.getString("cname"));
		            b.setPid(rs.getInt("pid"));
		            b.setPname(rs.getString("pname"));
		            b.setMrp(rs.getFloat("mrp"));
		            b.setQuantity(rs.getInt("quantity"));
		            b.setDiscount(rs.getFloat("discount"));
		            
		         // Set the retrieved date directly to the Bill object
		            b.setDate(rs.getDate("date")); // No need for conversion

		            
		            b.setPrice(rs.getFloat("price"));
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return b;
	}

	@Override
	public List<Bill> getsBillProducts() {
		
		List<Bill> blist = new ArrayList<>();
		String sql = "select * from createbill";
		
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()){
				Bill b = new Bill();
				b.setBillno(rs.getInt("bid"));
				b.setPid(rs.getInt("pid"));
				b.setQuantity(rs.getInt("quantity"));
				b.setPname(rs.getString("pname"));
				b.setMrp(rs.getFloat("mrp"));
				b.setPrice(rs.getFloat("price"));
				
				blist.add(b);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return blist;
	}

	@Override
	public List<Bill> searchBill(String data) {
		 List<Bill> bList = new ArrayList<>();
		    String sql = "SELECT bid, cname, price, date FROM createbill WHERE bid LIKE '%" + data + "%' ";
		    
		    try {
		        Statement stm = DB.getConnection().createStatement();
		        ResultSet rs = stm.executeQuery(sql);
		        
		        while (rs.next()) {
		            Bill b= new Bill();
		            b.setBillno(rs.getInt("bid"));
		            b.setCustname(rs.getString("cname"));
		            b.setPrice(rs.getFloat("price"));
		            b.setDate(rs.getDate("date"));
		            
		            bList.add(b);
		        }
		        
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    
		    return bList;
		
	}

}
