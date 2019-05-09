package dreamschool.cscourse.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.accName =  "È«±æµ¿";
		acc.accNo = "123-456789";
		acc.balance = 10000;
		
		acc.deposit(-20000);
		System.out.println("ÀÜ¾× : " +acc.balance);
		acc.withdraw(45000);
		System.out.println("ÀÜ¾× : " +acc.balance);
		
		

	}

}
