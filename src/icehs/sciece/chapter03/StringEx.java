package icehs.sciece.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String king = "�������";
		String man = "10000";
		int year = 2019;
		String yesno = "true";
		boolean boolYesNo = Boolean.parseBoolean(yesno);
		
		int intMan = Integer.parseInt(man);
		
		System.out.println(king +" :"+ man);
		System.out.println(year+"��");
		System.out.println(man+year);
		System.out.println(intMan * 4 + year);
		System.out.println(boolYesNo);
	}

}
