package encapsulation;

public class Test {

	public static void main(String[] args) {
		Product p = new Product();
		
		p.setId(123123);
		p.setName("TV");
		p.setCompany("CG");
		p.setPrice(89756);
		
		System.out.println(p);
		
//		System.out.println("ID :"+ p.getId());
//		System.out.println("ID :"+ p.getName());
//		System.out.println("Company :"+p.getCompany());
//		System.out.println("Price :" + p.getPrice());
	}
}
