package ClassObjectPractice;

public class Area {

	/* --- Level 1 ------------
	 * 1 
	 */
	int length;
	int breadth;
	void setDim(int l, int b) {
		length = l;
		breadth = b;
		
	}
	void getArea() {
		int area = length * breadth;
		System.out.println("Area : " + area);
		
	}
	
}


