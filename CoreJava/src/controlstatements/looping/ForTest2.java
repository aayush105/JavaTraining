package controlstatements.looping;

public class ForTest2 {
	
	public static void main(String[] args) {
		int os= 0;
		int es = 0;
//		for(int i=1 ; i<=100; i++) {
//			s= s+i;
//		}
//		System.out.println("Total : "+s);
		
		for ( int i = 1; i<=100; i++) {
			if(i%2==0) {
				es = es + i;
			} else {
				os = os + i;
			}
		}
		System.out.println("Odd sum : "+ os);
		System.out.println("Even sum : "+ es);
		System.out.println("Total sum : "+ (es + os));
	}
}
