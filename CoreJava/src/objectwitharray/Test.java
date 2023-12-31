package objectwitharray;

public class Test {

	public static void main(String[] args) {
		//store and print data of 5 books
		// Create an array of Book objects
				Book[] books = new Book[5];

				// Create and set data for each book
				books[0] = new Book();
				books[0].setId(1);
				books[0].setName("Book 1");
				books[0].setAuthor("Author 1");
				books[0].setPrice(100);

				books[1] = new Book();
				books[1].setId(2);
				books[1].setName("Book 2");
				books[1].setAuthor("Author 2");
				books[1].setPrice(200);

				books[2] = new Book();
				books[2].setId(3);
				books[2].setName("Book 3");
				books[2].setAuthor("Author 3");
				books[2].setPrice(300);

				books[3] = new Book();
				books[3].setId(4);
				books[3].setName("Book 4");
				books[3].setAuthor("Author 4");
				books[3].setPrice(400);

				books[4] = new Book();
				books[4].setId(5);
				books[4].setName("Book 5");
				books[4].setAuthor("Author 5");
				books[4].setPrice(500);

				// Print data for each book
				Test t = new Test();
				for (int i = 0; i < books.length; i++) {
					t.printBook(books[i]);
					System.out.println("------------------------");
				}
	}
	
	void printBook(Book b1) {
		System.out.println("Id : "+ b1.getId());
		System.out.println("Name : "+ b1.getName());
		System.out.println("Author : "+ b1.getAuthor());
		System.out.println("Price : "+ b1.getPrice());
		
	}
}
