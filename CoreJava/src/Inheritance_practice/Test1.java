package Inheritance_practice;

public class Test1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p.printParent();
		c.printChild();
//	    c.printParent(); // this can't be called as child class doesn't have the method of parent class
	} 
}
