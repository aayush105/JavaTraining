package Practice_3;

public class Director extends Manager{
	private double budget;
	
	Director(int empid, String name, String ssn, double salary, String deptName, double budget) {
		super(empid, name, ssn, salary, deptName);
	this.budget = budget;	
	}
	
	public double getBudget() {
		return budget;
	}
//	public void setBudget(double budget) {
//		this.budget = budget;
//	}

}
