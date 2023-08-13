package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// getConnection(url,un.pasw);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/<dbname>", "<username>", "<password>");

		//------------------ insert sql ----------------------

		// a) write sql
		String sql = "insert into user(id, name, password) values(3, 'ram', '99')";

		// b) create statement
		Statement stm = con.createStatement();

		// c) execute sql
		stm.execute(sql);

		// d) close db
		con.close();

		System.out.println("Success");
		
		// -------------- delete sql ----------------
		
//		String sql = "delete from user where id = 2";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		
//		System.out.println("Success");
		
		//-------------- update sql ---------------
//		String sql = "update user set password = 'test444' where id = 3 ";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("Success");
	
		// -------------- select sql ----------------	
//		String sql = "select * from user";
//		Statement stm = con.createStatement();
//		ResultSet rs = stm.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println("Id : "+rs.getInt("id"));
//			System.out.println("Usernamee: "+rs.getString("name"));
//			System.out.println("Password: "+rs.getString("password"));
//		}
	}
}
