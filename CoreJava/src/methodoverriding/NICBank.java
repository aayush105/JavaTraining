package methodoverriding;

public class NICBank extends CentralBank{
	
	@Override
	void getName() {
		System.out.println("NIC Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("10%");
	}
}
