package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "�Ƹ޸�ī��";
		ame.price = 3500;	
		
		Coffee latte = new Coffee();
		latte.name = "��";
		latte.price = 4000;	
		
		
		Coffee maki = new Coffee();
		maki.name = "ī��� ��Ű�ƶ�";
		maki.price = 4500;	
		
		ame.printInfo();
		latte.printInfo();
		maki.printInfo();
		
		System.out.println("�� �ݾ� : "+ (ame.price + latte.price + maki.price));

	}

}
