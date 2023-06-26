package constructor;

import java.util.Scanner;

public class Area {

	//question no 7 lvl 1
	
	int length;
	int breadth;
	
	Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		
	}
	void returnArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : "+ area);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the length of rectangle: ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		int breadth = sc.nextInt();
		Area a = new Area(length, breadth);
		
		a.returnArea();
	}
	
}

