package constructor;

public class AddDistance {

	int feet;
	int inches;
	
//	int feet1;
//	int inches1;
//	
//	int feet2;
//	int inches2;
	
	
	AddDistance(){
	}
	
	AddDistance(int feet, int inches){
		this.feet = feet;
		this.inches = inches;
	}
	
//	AddDistance(int feet1, int inches1, int feet2, int inches2){
//		this.feet1 = feet1;
//		this.inches1 = inches1;
//		this.feet1 = feet2;
//		this.inches1 = inches2;
//	}
	
	void calculate() {
		int totalInches = (this.feet * 12 + this.inches) ;
		int newFeet = totalInches/12;
		int newInches = totalInches % 12;
		
		System.out.println("Distance: "+newFeet+" feet, "+newInches+" inches");
	}
	
	public static void main(String[] args) {
		AddDistance d = new AddDistance(5,10);
		d.calculate();
	}
}

// two distance are not added 