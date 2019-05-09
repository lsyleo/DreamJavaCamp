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
		System.out.println("��ǰ�� : "+this.getName());
		System.out.println("���� : ��"+this.getPrice()+" (���η� : "+this.getDiscountRate()+"%)");
		System.out.println("�ǸŰ� : ��"+ (this.getPrice() / 100 * this.getDiscountRate()));
		System.out.println("��� : "+this.description);
	}
	
	
	

}
