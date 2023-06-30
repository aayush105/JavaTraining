package Practice_3;

public class Employee {

	private int empid;
	private String name;
	private String ssn;
	private double salary;
	
	Employee(int empid, String name, String ssn, double salary ){
		this.empid = empid;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	void raiseSalary(double increase) {
		
	}
	
	void printEmployee() {
		System.out.println("ID :"+this.getEmpid());
		System.out.println("Name :"+this.getName());
		System.out.println("SSN :"+this.getSsn());
		System.out.println("Salary :"+this.getSalary());
	}
	
}
