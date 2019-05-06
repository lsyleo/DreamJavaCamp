package dreamschool.cscourse.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		
		System.out.println("숫자 : "+ num);
		System.out.println("백의자리 숫자 : "+ num / 100);
		System.out.println("천의 자리 숫자 : "+ num % 100 / 10);
		System.out.println("천의 자리 숫자 : "+ num % 10);
	}

}
