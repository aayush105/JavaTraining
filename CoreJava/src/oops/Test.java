package oops;

public class Test {
public static void main(String[] args) {
	// math book
	Book b = new Book();
	
		b.id = 323;
		b.name ="Math";
		b.author = "C.M Joshi";
		b.price = 9000;
		
		b.printBookInfo();
		
	// rectangle
		Rectangle r = new Rectangle();
		
		r.length = 12;
		r.breadth = 14;
		r.printArea();
		
	
}
}
