package dreamschool.cscourse.chapter10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile [] mobiles = new Mobile[2];
		mobiles[0] = new Galaxy("Galaxy","�ȵ���̵� ������");
		mobiles[1] = new IPhone("iPhone","���");
		
		
		mobiles[0].call(5);
		mobiles[0].charge(30);
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}
	
}
