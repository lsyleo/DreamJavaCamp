package dreamschool.cscourse.chapter06;

public class Product {
	String name;
	int price;
	int discount;
	public Product(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	public Product(String name, int price, int discount) {
		
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	void printInfo() {
		System.out.println("====="+this.name+"=====");
		System.out.println("정가 : " + this.price + "원");
		if(this.discount != 0) {
			System.out.println("할인율 : "+ this.discount + "원");
		}
		else {
			System.out.println("할인율 : 할인하지 않음");
		}
	}
	

}
