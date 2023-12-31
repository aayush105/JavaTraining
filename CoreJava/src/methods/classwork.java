package methods;

import java.util.Scanner;

public class classwork {
	/*
	 *  Q) find area and volumes as:
	 *  	a) getArea:
	 *  	-> pass l and b as a parameter
	 *  	-> calculate area
	 *  	-> return area
	 *  	-> call this method in main
	 *  
	 *  	b) volume:
	 *  	-> pass area and height as parameter
	 *  	-> calculate volume
	 *  	-> print area
	 *  	-> print volume
	 *  	-> call this method in main
	 * 
	 */

	public static void main(String[] args) {
		int area = getArea(3,4);
		int vol = volume(area, 6);
		System.out.println(area);
		System.out.println(vol);
		input();
		
	}
	
	static int getArea(int l, int b) {
		int area = 0;
		area = l*b;
		return area;
	}
	
	
	static int volume(int area, int height) {
		int vol = 0;
		vol = area * height;
		return vol;
	}
	
	
	/*
	 * Q) SI and amout
	 * a) input
	 * b) processing
	 * c) output
	 * 
	 */
	
	static void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the P, T, R for calculation:");
		int p = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		
		processing(p,t,r);
	}
	static void processing(int a, int b , int c) {
		
		int SI = (a*b*c)/100;
		int amt = a + SI;
		
		output(SI,amt);
	}
	static void output(int SI, int amt) {
		System.out.println("SI : " +SI);
		System.out.println("Amount : "+ amt);
	}
}
