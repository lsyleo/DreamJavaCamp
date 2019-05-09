package dreamschool.cscourse.chapter10;

public class FundAccount extends Account{
	private int principal;
	private double earningRate;
	
	
	

	public FundAccount(String number, String name, int balance,double earningRate,int principal) {
		super(number, name, balance);
		this.earningRate = earningRate;
		this.principal = principal;
		
	}
	
	

	public double getEarningRate() {
		
		
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
		
		
	}
	
	
	public void earnMoney() {
		System.out.println("수익이 발생하였습니다");
	}
	
	
	public void printAccountInfo() {
		System.out.println("펀드 계좌를 개설합니다");
		System.out.println("펀드  계좌 번호 : "+this.getNumber());
		System.out.println("예금주 : "+this.getName());
		System.out.println("잔액 : "+this.getBalance()+"원");
		System.out.println("수익률 : "+this.earningRate + "%");
		
	}
	
}
