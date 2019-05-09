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
		System.out.println("������ �߻��Ͽ����ϴ�");
	}
	
	
	public void printAccountInfo() {
		System.out.println("�ݵ� ���¸� �����մϴ�");
		System.out.println("�ݵ�  ���� ��ȣ : "+this.getNumber());
		System.out.println("������ : "+this.getName());
		System.out.println("�ܾ� : "+this.getBalance()+"��");
		System.out.println("���ͷ� : "+this.earningRate + "%");
		
	}
	
}
