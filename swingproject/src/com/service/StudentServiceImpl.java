package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Student;

public class StudentServiceImpl implements StudentService{

	@Override
	public boolean addStudent(Student s) {
		
		 String sql = "INSERT INTO student (fname, lname, gender, email, phone, dob, college, faculty, rollno, age, country, city, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			pstm.setString(1, s.getFname());
	        pstm.setString(2, s.getLname());
	        pstm.setString(3, s.getGender());
	        pstm.setString(4, s.getEmail());
	        pstm.setString(5, s.getPhone());
	        pstm.setString(6, s.getDob());
	        pstm.setString(7, s.getCollege());
	        pstm.setString(8, s.getFaculty());
	        pstm.setInt(9, s.getRollno());
	        pstm.setInt(10, s.getAge());
	        pstm.setString(11, s.getCountry());
	        pstm.setString(12, s.getCity());
	        pstm.setString(13, s.getState());
	        
	        pstm.execute();
	        return true ;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		String sql = " delete from student where id = "+ id ;
		
		try {
			Statement stm = DB.getConnection().createStatement();
			stm.execute(sql);
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentById(int id) {
		
		return null;
	}

	@Override
	public List<Student> getsAllStudents() {
		List<Student> list = new ArrayList<>();
		String sql = "Select * from student";
		
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Student s = new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setAge(rs.getInt("age"));
				s.setPhone(rs.getString("phone"));
				
				list.add(s);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public List<Student> searchStudents(String data) {
		List<Student> list = new ArrayList<>();
		String sql = " Select * from student where fname like '%"+data+"%' OR college like '%"+data+"%' OR lname like '%"+data+"%' OR age like '%"+data+"%' OR phone like '%"+data+"%' ";
		
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Student s = new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setAge(rs.getInt("age"));
				s.setPhone(rs.getString("phone"));
				
				list.add(s);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return list;
	
	}

}
