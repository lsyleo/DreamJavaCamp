package icehs.sciece.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String employeeYear = "2002";
		int workedYear = 2019 - Integer.parseInt(employeeYear);
		
		System.out.println("이름 :"+ name);
		System.out.println("입사년도 :"+ employeeYear);
		System.out.println("근무년수 :"+ workedYear);
		

	}

}
