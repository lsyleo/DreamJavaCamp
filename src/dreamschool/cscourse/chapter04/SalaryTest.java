package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {

		int salary = 10000000;
		int total = salary * 12;
		
		int bonus = salary / 100 * 20 * 4;
		int afterTaxTotal = (total -= (total / 100 * 10));
		int afterTaxBonus = (bonus -= (bonus / 1000 * 55));
		
		System.out.println("���� : "+ total + ", ���� ���� : " + afterTaxTotal);
		
		System.out.println("���ʽ� : "+ bonus + ", ���� ���ʽ� : " + afterTaxBonus);
		
		System.out.println("���ݾ� : " + (afterTaxTotal + afterTaxBonus));
		
		

	}

}
