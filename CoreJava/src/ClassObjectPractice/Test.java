package ClassObjectPractice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		Area a = new Area();
		System.out.println("enter the length");
		a.length = sc.nextInt();
		
		System.out.println("enter the breadth");
		a.breadth = sc.nextInt();
		
		a.setDim(a.length, a.breadth);
		a.getArea();
		
	}
}
