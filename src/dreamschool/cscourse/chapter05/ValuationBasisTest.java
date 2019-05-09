package dreamschool.cscourse.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		int num3 =40;
		int num4 =50;
		int num5 =80;
		
		
		double result = 0;
		result += (num1 * num2 / 2 * 0.6);
		result += (num3 + num4) / 2 * 0.13;
		result += num5 * 0.27;
		
		System.out.println("평가점수 : " + result);
		
		if(result >=95 && result <=100) {
			
		}
		

	}

}
