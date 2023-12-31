package constructor;

public class Employee {

	// question no 10 lvl 1
	String name;
	int EOJ;
	long salary;
	String address;
	
	// Static flag to track if the header has been printed
    static boolean headerPrinted = false;
	
	Employee(){
	}

	Employee(String name, int EOJ, long salary, String address){
		this.name = name;
		this.EOJ = EOJ;
		this.salary = salary;
		this.address = address;
		
	}
	
	void display() {
		//System.out.printf("| %-8s | %-10s | %-8s | %-10s | %n","Name","Year of joining","Salary","Address");
		
		// Print the header only if it hasn't been printed yet
        if (!headerPrinted) {
            System.out.printf("| %-8s | %-10s | %-8s | %-10s | %n","Name","Year of joining","Salary","Address");
            headerPrinted = true;
        }
		// prints the employee information
		System.out.printf("| %-8s | %-15s | %-8s | %-10s | %n",name,EOJ,salary,address);
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Robert",1994,15000,"ktm");
		Employee e1 = new Employee("Sam",2000,20000,"Bkt");
		Employee e2 = new Employee("John",1999,25000,"Pkr");
		e.display();
		e1.display();
		e2.display();
	}
	
}
