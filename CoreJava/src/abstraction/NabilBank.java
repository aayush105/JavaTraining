package abstraction;

public class NabilBank extends CentralBank{

	@Override
	void getName() {
		System.out.println("Nabil Bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("12%");
		
	}

}
