package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ReadFileTest {

	
	public static void main(String[] args) throws IOException {
		
		// FileReader file = new FileReader("/media/aayush/ACC0CC76C0CC4872/JAVA Class/hello1.txt");
		
		// BufferedReader br = new BufferedReader(file);
		// buffer is created so that file will be read from the cache to overcome the reading from file 
		// which causes to slow to read
		
		// String line;
		// while((line = br.readLine()) != null) {
			// System.out.println(line);
		// }
		
		// ------------ reading excel file ---------
		
        FileReader file = new FileReader("/media/aayush/ACC0CC76C0CC4872/JAVA Class/file023/student.csv");
		
		BufferedReader br = new BufferedReader(file);
		// buffer is created so that file will be read from the cache to overcome the reading from file 
		// which causes to slow to read
		
		String line;
		br.readLine(); // this skip the header of the data i.e "id, nmae, city etc"
		while((line = br.readLine()) != null) {
			System.out.println(line);
			String [] data = line.split(",");
			
//			System.out.println(data[0]);
//			System.out.println(data[1]);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fileStudentDB","root","Aayush_105");
				
				String sql = "insert into student(id,name,age,phone,city) values(?,?,?,?,?)";
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setString(1, data[0]);
				pstm.setString(2, data[1]);
				pstm.setString(3, data[2]);
				pstm.setString(4, data[3]);
				pstm.setString(5, data[4]);
				
				pstm.execute();
				System.out.println("Success");
				con.close();
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
