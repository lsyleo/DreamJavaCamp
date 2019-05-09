package dreamschool.cscourse.chapter08;

public class Account {
	
	String accNo;
	int balance;
	double interestRate;
	
	
	
	public Account(String accNo, int balance , double interestRate) {
		
		this.interestRate = interestRate;
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getNumber() {
		return this.accNo;
	}
	public int getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public void setBalance(int balance) {
		
		this.balance = balance; 
	}
	public void setInterestRate(double interestRate) {
		
		this.interestRate = interestRate; 
	}
	
	public int calculateInterest() {
		int interest = (int)(balance / 100 * this.interestRate); 
		this.balance += interest;
		return interest;
	}
	
	void printAccountInfo() {
		System.out.println("°èÁÂ¹øÈ£ :" + accNo);
		System.out.println("ÀÜ¾× : "+ balance);
		System.out.println("ÀÌÀ² : "+ interestRate);
	}
	
	
	

}
