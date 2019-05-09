package dreamschool.cscourse.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		Chocolate [] choco = new Chocolate [3];
		int sum =0;
		choco[0] = new Chocolate("아마도라","다크",2200);
		choco[1] = new Chocolate("카페 키리쉬","다크",2500);
		choco[2] = new Chocolate("트리플 블랑","화이트",2300);
		
		for(int i = 0; i < choco.length;i++) {
			choco[i].printChocolateInfo();
			if(choco[i].getType().equals("화이트")) {
					choco[i].changeChocolateInfo(choco[i].getName(),choco[i].getPrice() - choco[i].getPrice() / 100 * 20);	
			}
			sum += choco[i].getPrice();
			
			
		}
		
		System.out.println("하나씩 구매했을때 : "+sum);
		

	}

}
