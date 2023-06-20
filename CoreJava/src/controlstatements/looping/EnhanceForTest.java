package controlstatements.looping;

public class EnhanceForTest {
	/*
	 * ---------------- Enhance for loop ----------------------
	 * # use to read data from collection.(array,list,set,map, etc)
	 * 
	 * syntax:
	 * for(data_type var : collection){
	 *  //statement
	 *  }
	 */
	
	public static void main(String[] args) {
		int s = 0;
		int data[] = {13,23,21,31,23,21,31,32,13,12,31,23,12,32};
		for(int x : data) {
			System.out.println(x);
			s = s + x;
		}
		System.out.println("Total : "+s);
	}
}
