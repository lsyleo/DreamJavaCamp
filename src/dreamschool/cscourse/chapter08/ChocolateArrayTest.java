package dreamschool.cscourse.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		Chocolate [] choco = new Chocolate [3];
		int sum =0;
		choco[0] = new Chocolate("�Ƹ�����","��ũ",2200);
		choco[1] = new Chocolate("ī�� Ű����","��ũ",2500);
		choco[2] = new Chocolate("Ʈ���� ���","ȭ��Ʈ",2300);
		
		for(int i = 0; i < choco.length;i++) {
			choco[i].printChocolateInfo();
			if(choco[i].getType().equals("ȭ��Ʈ")) {
					choco[i].changeChocolateInfo(choco[i].getName(),choco[i].getPrice() - choco[i].getPrice() / 100 * 20);	
			}
			sum += choco[i].getPrice();
			
			
		}
		
		System.out.println("�ϳ��� ���������� : "+sum);
		

	}

}
