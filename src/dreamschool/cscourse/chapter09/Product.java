package dreamschool.cscourse.chapter09;

public class Product {
	private String name;
	private int price;
	private int discountRate;
	
	public Product(String name, int price, int discountRate) {
		
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public void printProductInfo() {
		System.out.println("제품명 : "+this.getName());
		System.out.println("정가 : ￦"+this.getPrice()+" (할인률 : "+this.getDiscountRate()+"%)");
		System.out.println("판매가 : ￦"+ (this.getPrice() / 100 * this.getDiscountRate()));
		
	}
	public String calculateDiscountPrice() {
		return null;
	}
	
	

}
