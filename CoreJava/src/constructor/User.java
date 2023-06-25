package constructor;

public class User {
	// instance variable
	String userName;
	String password;
	
	// ------------ Default Constructor --------------
//	User(){
//		userName = "test";
//		password = "123";
//	}
//	
	// ----------- parameterized constructor -----------
	
//	User(String un, String psw){
//		userName = un;
//		password = psw;
//	}
	
	User(String userName, String password){
		//this(); // calling default constructor
		//this("aaa, "13"); // calling parameterized constructor
		
		
		// if "this" is not used then the output will be null as local variable and instance variable gets conflicted bcz of having same name
		this.userName = userName; // calling instance
		this.password = password;
	
		// this.printUser(); //calling instance method
	// "this" keyword represent current object
	// we can call instance variable, instance method and constructors.
		
	}
	
	void printUser() {
		System.out.println("Username : "+userName);
		System.out.println("Password : " +password);
	}
	
	public static void main(String[] args) {
//		User u = new User(); // default
		User u = new User("Aayush","777"); // parameterized
		u.printUser();
		
   		
		/*
		 * -------- Object class (Parent class) ------------
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 *
		 */
	}
}
