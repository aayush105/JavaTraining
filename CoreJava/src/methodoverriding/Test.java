package methodoverriding;

public class Test {

	public static void main(String[] args) {
		
		//static or early binding of object
		
		NICBank nb = new NICBank();
		nb.getName();
		nb.getInterestRate();
		
		//up-casting -> dynamic binding as parent class can make the object of child class
		CentralBank b = new PrabhuBank();
		
		
	}
	// dynamic or late binding of object
	// runtime polymorphism as this "CentralBank b" can't give 100% result that it will give output of Central bank as it can give output of any bank i.e child bank so 25% is probability
	
	void printBankInfo(CentralBank b) {
		b.getName();
		b.getInterestRate();
	}
	
}
