package dreamschool.cscourse.chapter04;

public class LogicalOperateEx {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		boolean rut1 = (num1 > 2) && (num1 > 5);
		boolean rut2 = (num1 > 2) && (num1 == num2);
		boolean rut3 = (num1 <= 2) || (num1 != num2);
		boolean rut4 = (num1 <= 2) || (num1 > num2);
		
		System.out.println(rut1);
		System.out.println(rut2);
		System.out.println(rut3);
		System.out.println(rut4);
		
	}

}
