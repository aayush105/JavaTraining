package objectwithmethod;

public class Test {

	public static void main(String[] args) {
//		Customer c = new Customer();
//		
//		c.setId(123);
//		c.setName("Ram");
//		c.setAge(21);
//		c.setCity("ktm");

		
		Test test = new Test(); // Create an instance of the Test class
		Customer c = test.getCustomerData();
		test.printCustomer(c);
		
	}
	
	// --------------------- object as parameter --------------
	
	void printCustomer(Customer cust) {
		System.out.println("ID : "+cust.getId());
		System.out.println("Name : "+cust.getName());
		System.out.println("Age : "+cust.getAge());
		System.out.println("City : "+cust.getCity());
	}
	
	//---------------- object as return ------------------
	
	Customer getCustomerData() {
		
		Customer c = new Customer();
		
		c.setId(123);
		c.setName("Ram");
		c.setAge(21);
		c.setCity("ktm");
//		printCustomer(c);
		return c;
	}
	
}
