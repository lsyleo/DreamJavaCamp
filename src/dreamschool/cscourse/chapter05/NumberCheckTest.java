package dreamschool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 = 23; int num2 = 96;
		int result = num1 * num2;
		
		if(result < 0 )
			System.out.println("���� ��� ������");
		if(result < 10) {
			System.out.println(num1 + " * " + num2 +" : "+"���ڸ� ���� �Դϴ�");
		}
		else if(result < 100) {
			System.out.println(num1 + " * " + num2 +" : "+"���ڸ� ���� �Դϴ�");
		}
		else {
			System.out.println(num1 + " * " + num2 +" : "+"���ڸ� �� �̻��Դϴ�");
		}
		

	}

}
