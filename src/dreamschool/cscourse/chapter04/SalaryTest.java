package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {

		int salary = 10000000;
		int total = salary * 12;
		
		int bonus = salary / 100 * 20 * 4;
		int afterTaxTotal = (total -= (total / 100 * 10));
		int afterTaxBonus = (bonus -= (bonus / 1000 * 55));
		
		System.out.println("연봉 : "+ total + ", 세후 연봉 : " + afterTaxTotal);
		
		System.out.println("보너스 : "+ bonus + ", 세후 보너스 : " + afterTaxBonus);
		
		System.out.println("지금액 : " + (afterTaxTotal + afterTaxBonus));
		
		

	}

}
