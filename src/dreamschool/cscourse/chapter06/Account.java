package dreamschool.cscourse.chapter06;

public class Account {
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else {
			balance += money;
			System.out.println(money + " �� �Ա��մϴ�");
			
		
		}
		System.out.println("�ܾ� : " + balance); 
		
	}
	
	int withdraw(int money) {
		if(money <0 ) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			return 0 ;
		}
		else if(money > balance) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
			return 0;
		}
		else {
		 balance -= money;
		 System.out.println(money + " �� �Ա��մϴ�");
		 
		 return money ;
		}
	}
	
	void printAccountInfo() {
		System.out.println("������ : "+ accName);
		System.out.println("���¹�ȣ :" + accNo);
		System.out.println("�ܾ� : "+ balance);
	}
	
	
	

}
