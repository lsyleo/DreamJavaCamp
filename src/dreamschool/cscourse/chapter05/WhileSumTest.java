package dreamschool.cscourse.chapter05;

public class WhileSumTest {

	public static void main(String[] args) {
		int index = 1;
		int sum = 0;
		
		while(sum <=50) {
			sum += index;
			if(sum >= 50) {
				break;
			}
			index++;
		}
		System.out.println("Ƚ�� : "+index);
		System.out.println("�հ� : "+sum);
	}
	

}
