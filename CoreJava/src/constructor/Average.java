package constructor;

public class Average {

	// question no 8 lvl 1
	int a;
	int b;
	int c;
	
	Average(){
	}
	Average(int a,int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	void calulate() {
		int avg = (a+b+c)/3;
		System.out.println("Average of three numbers is : "+avg);
	}
	
	public static void main(String[] args) {
		Average a = new Average(5,5,5);
		a.calulate();
	}
}
