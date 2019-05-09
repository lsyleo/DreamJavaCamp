package dreamschool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 = 23; int num2 = 96;
		int result = num1 * num2;
		
		if(result < 0 )
			System.out.println("음수 취급 ㄴㄴ요");
		if(result < 10) {
			System.out.println(num1 + " * " + num2 +" : "+"한자리 숫자 입니다");
		}
		else if(result < 100) {
			System.out.println(num1 + " * " + num2 +" : "+"두자리 숫자 입니다");
		}
		else {
			System.out.println(num1 + " * " + num2 +" : "+"세자리 수 이상입니다");
		}
		

	}

}
