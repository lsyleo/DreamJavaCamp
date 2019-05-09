package dreamschool.cscourse.chapter09;

public class Television extends Product{
	private String description;

	public Television(String name, int price, int discountRate, String description) {
		super(name, price, discountRate);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void printInfo() {
		System.out.println("제품명 : "+this.getName());
		System.out.println("정가 : ￦"+this.getPrice()+" (할인률 : "+this.getDiscountRate()+"%)");
		System.out.println("판매가 : ￦"+ (this.getPrice() / 100 * this.getDiscountRate()));
		System.out.println("비고 : "+this.description);
	}
	
	
	

}
