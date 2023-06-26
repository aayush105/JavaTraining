package constructor;

public class Rectangle {
	
	// question no 6 lvl 1
	
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		int area = length*breadth;
		System.out.println("Area of reactangle : "+area);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		Rectangle r1 = new Rectangle(5,8);
		
		r.area();
		r1.area();
	}
}
