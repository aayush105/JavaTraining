package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;

public class FileTest {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("/media/aayush/ACC0CC76C0CC4872/JAVA Class/file023/hello1.txt");
		
//		System.out.println(file.isDirectory()); // gives "true" if it is a directory else "false"
//		System.out.println(file.exists()); // gives "true" only if the file exist else "false"
		
//		System.out.println(file.isFile()); 
		
		File dir = new File("/media/aayush/ACC0CC76C0CC4872/JAVA Class/file023");
		dir.mkdir();
		
		// list file name from folder
		String [] fileNames = dir.list();
		System.out.println(Arrays.toString(fileNames)); // prints the name of all the file in the file023
		
		System.out.println(Arrays.asList(fileNames).contains("hello.txt")); // checks whether the file exist or not
		
		
		// get all files from folder
		File[] files = dir.listFiles();
		
//		for(File f : files) {
//			System.out.println(Files.readString(Path.of(f.getAbsolutePath())));
//		}
//		
//		Arrays.asList(files).forEach(f -> {
//			try {
//				System.out.println(Files.readString(Path.of(f.getAbsolutePath())));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});

		// ------------ copy file ---------------
		Files.copy(file.toPath(), Path.of("/media/aayush/ACC0CC76C0CC4872/JAVA Class/file023/copyBook.txt"), StandardCopyOption.REPLACE_EXISTING);
		// (source, destination,replace the existing file)
		
		// ----- delete file ---------------
		Files.delete(Path.of("/media/aayush/ACC0CC76C0CC4872/JAVA Class/file023/copyBook.txt"));
		
		
		//-------- create a file with a content in it -------
		Path path = Path.of("/media/aayush/ACC0CC76C0CC4872/JAVA Class/file023/pppp.txt");
		File fl = Files.createFile(path).toFile();
		
	}
	
}
