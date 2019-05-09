package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;	
		
		Coffee latte = new Coffee();
		latte.name = "라떼";
		latte.price = 4000;	
		
		
		Coffee maki = new Coffee();
		maki.name = "카라멜 마키아또";
		maki.price = 4500;	
		
		ame.printInfo();
		latte.printInfo();
		maki.printInfo();
		
		System.out.println("총 금액 : "+ (ame.price + latte.price + maki.price));

	}

}
