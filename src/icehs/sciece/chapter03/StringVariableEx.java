package icehs.sciece.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "����ȣ";
		String mathScore = "96";
		int englishScore = 82;
		
		int intMathScore = Integer.parseInt(mathScore);
		
		System.out.println("�̸� : "+ name);
		System.out.println("�������� : "+ mathScore);
		System.out.println("�������� : "+ englishScore);
		System.out.println("------------------------------");
		System.out.println(mathScore + englishScore);
		System.out.println(intMathScore + englishScore);

	}

}
