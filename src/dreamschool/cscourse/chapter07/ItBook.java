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
		System.out.println(this.title + "  제목을 변경합니다  " + this.title +"  ====>  "+title +"\n\n");
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println(this.price + "  정가를 변경합니다  " + this.price +"  ====>  "+price +"\n\n");
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		System.out.println(this.discountRate + "  할인률을 변경합니다  " + this.discountRate +"  ====>  " + discountRate +"\n\n");
		this.discountRate = discountRate;
	}
	
	public void printInfo() {
		System.out.print("제목 : "+getTitle()+"   ");
		System.out.print("가격 : "+getPrice()+"원      ");
		System.out.println("할인율 : "+getDiscountRate()+"%   할인가 :"+ (int)(this.price * (100 - discountRate)/100) + "원");
	}
	
	

}
