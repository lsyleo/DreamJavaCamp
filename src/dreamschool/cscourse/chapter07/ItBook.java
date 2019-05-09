package dreamschool.cscourse.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double discountRate;
	
	public ItBook(String title, int price, double discountRate) {

		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		System.out.println(this.title + "  ������ �����մϴ�  " + this.title +"  ====>  "+title +"\n\n");
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println(this.price + "  ������ �����մϴ�  " + this.price +"  ====>  "+price +"\n\n");
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		System.out.println(this.discountRate + "  ���η��� �����մϴ�  " + this.discountRate +"  ====>  " + discountRate +"\n\n");
		this.discountRate = discountRate;
	}
	
	public void printInfo() {
		System.out.print("���� : "+getTitle()+"   ");
		System.out.print("���� : "+getPrice()+"��      ");
		System.out.println("������ : "+getDiscountRate()+"%   ���ΰ� :"+ (int)(this.price * (100 - discountRate)/100) + "��");
	}
	
	

}
