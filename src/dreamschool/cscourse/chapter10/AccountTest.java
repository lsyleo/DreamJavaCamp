package dreamschool.cscourse.chapter10;

public class AccountTest {

	public static void main(String[] args) {
		
		Account[] acc = {new Account("1313-445566","����ġ",100000),
				new FundAccount("111-222","ȫ�浿",5280000,5.6,50000000),
				new FundAccount("666-7777","ȫ���",1029000,2.9,1000000)};
		
		for(Account a : acc) {
			if(a instanceof Account) {
				a.openAccount();
			}else if(a instanceof FundAccount) {
				((FundAccount)a).printAccountInfo();
				
			}
			System.out.println();
		}
		
		
		
		
		
		/*
		FundAccount acc1 = new FundAccount("111-2222","ȫ���",50000000,4.7);
		FundAccount acc2 = new FundAccount("666-6777","ȫ���",10000000,2.9);
		
		
		acc1.openAccount();
		System.out.println("������ �߻���");
		
		System.out.println();
		acc2.openAccount();
		System.out.println("������ �߻��߽��ϴ�");
		*/
	}

}
