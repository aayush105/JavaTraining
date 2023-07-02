package abstraction;

public class Test {
	
	public static void main(String[] args) {
		
		// CentralBank c = new CentralBank(); // cant be made this as object cant be made so through child class object should be made.
		CentralBank b = new NabilBank();
		b.getName();
		b.getInterestRate();
		
		UserService u = new UserServiceImpl();
		u.addUser();
		u.deleteUser();
		u.print();
	
		// this is removed as we have inherit the GeneralService to the UserService so that print() can be called through 
		// UserService inferface
//		GeneralService g = new UserServiceImpl();
//		g.print();
//		
	}
}
