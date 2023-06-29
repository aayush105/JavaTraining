package methodoverriding;

public class PrabhuBank extends CentralBank{

	@Override
	void getName() {
		System.out.println("Prabhu Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("18%");
	}
}
