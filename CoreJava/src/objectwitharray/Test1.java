package objectwitharray;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Book[] books = getBookData();
		
		printData(books);
		}
	private static void printData(Book[] books) {
		// Print data for each book
		Test t = new Test();
		for (int i = 0; i < books.length; i++) {
			t.printBook(books[i]);
			System.out.println("------------------------");
			
		}
	}
	private static Book[] getBookData() {
		Book[] books = new Book[5];
		Scanner sc = new Scanner(System.in);
		
		// Create and set data for each book
		for(int i = 0;i<books.length;i++) {
			Book b= new Book();
			
			System.out.println("enter id:");
			b.setId(sc.nextInt());
			System.out.println("enter name:");
			b.setName(sc.next());
			b.setAuthor("Author 1");
			b.setPrice(100);
			books[i] = b;
			
		}
		sc.close();
		return books;
		
	}
	void printBook(Book b1) {
		System.out.println("Id : "+ b1.getId());
		System.out.println("Name : "+ b1.getName());
		System.out.println("Author : "+ b1.getAuthor());
		System.out.println("Price : "+ b1.getPrice());
		
	}
}

