package Practice_3;

public class Manager extends Employee{
	private String deptName;

	Manager(int empid, String name, String ssn, double salary, String deptName) {
		super(empid, name, ssn, salary);
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}


}
