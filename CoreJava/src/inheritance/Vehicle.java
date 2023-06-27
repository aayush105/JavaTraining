package inheritance;

public class Vehicle {

	private String color;
	public int speed;
	protected int size;
	
	protected void attributes() {
		System.out.println("Color : "+color);
		System.out.println("Speed : "+speed);
		System.out.println("Size : "+size);
	}
}
