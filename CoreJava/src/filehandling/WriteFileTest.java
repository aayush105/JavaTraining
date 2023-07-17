package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {

	/*
	 * a. FileWriter : write file
	 * a. FileReader : read file
	 *
	 */
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("/media/aayush/ACC0CC76C0CC4872/JAVA Class/hello1.txt",true);
		// here true is done to append the data into the existing data
		file.write("id = 1\n");
		file.write("Name = math\n");
		file.write("Author = Sita\n");
		file.write("price = 300\n");
		file.write("page = 10\n");
		file.close();
		
		System.out.println("success");
		
	}
}


