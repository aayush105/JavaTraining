package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// getConnection(url,un.pw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/<database name>","<username>","<password>");
		
		//----------- insert data ------------------
		
//		// a> write sql
//		String sql = "insert into student(id,name,faculty,year) values(3,'Ram','BCt','3')";
//		
//		
//		// b> create statement
//		Statement stm = con.createStatement();
//		
//		
//		//c> execute sql
//		stm.execute(sql);
//		
//		// d> close db
//		con.close();
//		System.out.println("Success");
		
		//---------- delete sql ----------------
		
//		String sql = "DELETE FROM student WHERE id = 5";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("Success");
		
		// ------- update sql ------------
		
//		String sql = "update student set name= 'oj', faculty ='BCT', year = 4  where id = 3 ";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("Success");
		
		// ------------ select sql -----------
		String sql = "select * from student";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt("id"));
			System.out.println("Name: "+rs.getString("name"));
			System.out.println("Faculty: "+rs.getString("faculty"));
			System.out.println("Year: "+rs.getInt("year"));
			System.out.println("----------------------");
		}
		
	}
}
