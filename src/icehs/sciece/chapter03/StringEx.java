package icehs.sciece.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String king = "¼¼Á¾´ë¿Õ";
		String man = "10000";
		int year = 2019;
		String yesno = "true";
		boolean boolYesNo = Boolean.parseBoolean(yesno);
		
		int intMan = Integer.parseInt(man);
		
		System.out.println(king +" :"+ man);
		System.out.println(year+"³â");
		System.out.println(man+year);
		System.out.println(intMan * 4 + year);
		System.out.println(boolYesNo);
	}

}
