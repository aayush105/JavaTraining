package inheritance;

public class Car extends Vehicle {

	private int cc;
	private int gears;
	
	public void attributesCar() {
		System.out.println("Speed of car : "+ super.speed);
		System.out.println("Size of car : "+ size);
		System.out.println("CC of car : "+ cc);
		System.out.println("No of gears of car : " + gears);
		
		super.attributes();
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		
//		c1.color = "Black";
		c1.speed = 200;
		c1.size = 22;
		c1.cc = 1000;
		c1.gears = 5;
		
		c1.attributes();
		
		//super.attribues(); // can't be called in a static context
		
		c1.attributesCar();
	}
	
}
