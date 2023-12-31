package inheritance;

public class InheritanceDocs {

	/*
	 * ------------ Inheritance --------------
	 * # use for code re-usability.
	 * # process of accessing properties and methods of parent/super/base class to child/sub/derived class is known as inheritance.
	 * 
	 * # Also known as IS-A relationship(e.g car is a vehicle)
	 * # Its a generalization to specialization process.
	 * # we can't inherit a private variables, private method and constructors.
	 * # we can inherit static variables and methods.
	 * # "extebds" keyword is used to inherit.
	 * # we can inherit only one class at a time. 
	 * 
	 * syntax :
	 * 
	 * class child_class_name extends parent_class_name {
	 * 
	 * 	// properties : parent + child
	 * 	
	 * 	// method : parent + child
	 * 
	 * }
	 * 
	 * e.g 
	 * 
	 * class A {
	 *  
	 *  }
	 * 
	 *  class B entends A{
	 *  // gets the properties and method ko class A
	 *  }
	 *  
	 *  class C extends B {
	 *  
	 *  // gets the properties and method ko class B 
	 *  // and after the class B is extends to Class A then class c also gets the properties and method ko class A as well
	 *  
	 *  }
	 *  
	 *  
	 *  -------------------- Method overloading in java ----------------------
	 *  
	 *  -> if a class have multiple methods by same name but different parameters, it is known as method overloading.
	 *  
	 *  e.g we have a method to sum(arg1, arg2) then it is only able to give sum of 2 number but for 3 number we have to make the another method havong same name i.e sum(arg1, arg2, arg3)
	 *  
	 *  it can be implemented by :
	 *  1> changing the data types
	 *  2> changing the arg size
	 *  
	 * 
	 */
}
