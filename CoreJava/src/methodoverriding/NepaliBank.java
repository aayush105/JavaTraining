package methodoverriding;

public class NepaliBank extends CentralBank {
	
	@Override
	void getName() {
		System.out.println("Nepal Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("2%");
	}
	
}
