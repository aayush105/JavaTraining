package inheritance;

public class Test {
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.id = 234;
		p.name = "Aayush";
		p.age = 23;
		p.company = "Google";
		p.progLang = "Java";
		p.salary = 600000;
		p.bonus = 10000;
		p.project = "HDTDC";
		
		p.print();
	}
}
