package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class REadFileUsingInputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("/media/aayush/ACC0CC76C0CC4872/JAVA Class/hello.txt");
		int data;
		while((data = file.read()) != -1) {
			System.out.print((char)data);
		}
	}

}
