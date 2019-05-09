package dreamschool.cscourse.chapter08;

public class AccontCalculatorTest {

	public static void main(String[] args) {
		Account[] acc = {new Account("1111-2222-5551",100000,4.5),
				new Account("1111-2222-5552",200000,4.5),
				new Account("1111-2222-5553",600000,4.5),
				new Account("1111-2222-5554",400000,4.5),
				new Account("1111-2222-5551",300000,4.5)
				};
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].printAccountInfo();
		}
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
		}
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].printAccountInfo();
		}
	}

}
