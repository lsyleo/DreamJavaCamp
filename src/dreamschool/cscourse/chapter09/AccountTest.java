package dreamschool.cscourse.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount acc1 = new FundAccount("111-2222","홍길순",50000000,4.7);
		FundAccount acc2 = new FundAccount("666-6777","홍길순",10000000,2.9);
		
		
		acc1.openAccount();
		System.out.println("수익이 발생함");
		
		System.out.println();
		acc2.openAccount();
		System.out.println("수익이 발생했습니다");
		
	}

}
