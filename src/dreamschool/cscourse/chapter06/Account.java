package dreamschool.cscourse.chapter06;

public class Account {
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}
		else {
			balance += money;
			System.out.println(money + " 원 입금합니다");
			
		
		}
		System.out.println("잔액 : " + balance); 
		
	}
	
	int withdraw(int money) {
		if(money <0 ) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			return 0 ;
		}
		else if(money > balance) {
			System.out.println("[에러] 잔액이 부족합니다.");
			return 0;
		}
		else {
		 balance -= money;
		 System.out.println(money + " 원 입금합니다");
		 
		 return money ;
		}
	}
	
	void printAccountInfo() {
		System.out.println("예금주 : "+ accName);
		System.out.println("계좌번호 :" + accNo);
		System.out.println("잔액 : "+ balance);
	}
	
	
	

}
