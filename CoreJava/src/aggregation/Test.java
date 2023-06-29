package aggregation;

public class Test {
public static void main(String[] args) {
	Car c = new Car();
	c.setColor("Black");
	c.setCompany("Tesla");
	c.setPrice(590899);
	c.setModel("Abc");
	
	
	Teacher t = new Teacher();
	t.setId(12);
	t.setName("Aayush Shrestha");
	t.setSubject("Java");
	t.setSalary(20000000);
	t.setCar(c);
	
	System.out.println("Id : "+ t.getId());
	System.out.println("Name : "+t.getName());
	System.out.println("Subject : "+t.getSubject());
	System.out.println("Salary : "+t.getSalary());
	
	System.out.println("-------- Car Info --------");
	System.out.println("Color : "+t.getCar().getColor());
	System.out.println("Company : "+ t.getCar().getCompany());
	System.out.println("Price : "+t.getCar().getPrice());
	System.out.println("Model : "+t.getCar().getModel());
}
}
