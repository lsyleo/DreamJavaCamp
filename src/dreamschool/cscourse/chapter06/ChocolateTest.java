package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		
		Chocolate choco = new Chocolate();
		choco.name = "�Ƹ�����";
		choco.type = "��ũ";
		choco.price = 2200;
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		int totalPrice = choco.calaulateTotalPrice(20);
		System.out.println(chocoName + "���ݷ� 20�� : " + totalPrice);
		choco.changeChocolateInfo("ī�� Ű����",2500);
		choco.printChocolateInfo();
		
		System.out.println("ī��⸮�� ���ݷ� 15�� (10% ����) :" +choco.calaulateTotalPrice(15,10));
		choco.changeChocolateInfo("Ʈ���� ���", "ȭ��Ʈ", 2300);
		choco.printChocolateInfo();
		

	}

}
