package abstraction;

public abstract class CentralBank {

		abstract void getName();
		abstract void getInterestRate();
		
		void moneyExRate() {
			System.out.println("1$ = 132");
			System.out.println("Yen 10 = 10");
			System.out.println("IC 1 = 1.6");
		}
		
	}

