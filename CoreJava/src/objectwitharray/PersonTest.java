package objectwitharray;

import java.util.Scanner;

public class PersonTest {

	
	public static void main(String[] args) {
		
		Person[] per = getPersonData();
		print(per);
	
		
	}
	private static Person[] getPersonData() {
		Person[] per = new Person[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< per.length; i++) {
			Person p = new Person();
			System.out.println("Enter first name:");
			p.setF_name(sc.next());
			System.out.println("Enter second name:");
			p.setL_name(sc.next());
			System.out.println("Enter age:");
			p.setAge(sc.nextInt());
			per[i]=p;
		}
		return per;
	}
	private static void print(Person[] per) {
		PersonTest t = new PersonTest();
		for(int i =0; i< per.length; i++) {
			t.printData(per[i]);
			System.out.println("-------------------");
		}
	}
	void printData(Person p) {
		System.out.println("First name:"+p.getF_name());
		System.out.println("Last name:"+p.getL_name());
		System.out.println("Age:"+p.getAge());
	}
	
	
}
