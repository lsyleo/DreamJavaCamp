package dreamschool.cscourse.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount acc1 = new FundAccount("111-2222","ȫ���",50000000,4.7);
		FundAccount acc2 = new FundAccount("666-6777","ȫ���",10000000,2.9);
		
		
		acc1.openAccount();
		System.out.println("������ �߻���");
		
		System.out.println();
		acc2.openAccount();
		System.out.println("������ �߻��߽��ϴ�");
		
	}

}
