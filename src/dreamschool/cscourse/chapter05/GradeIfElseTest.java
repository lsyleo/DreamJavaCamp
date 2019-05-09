package dreamschool.cscourse.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int gildong = 100;
		
		
		if(gildong >=90 && gildong <= 100) 
		{
			System.out.println("È«±æµ¿ : AÇÐÁ¡ ÀÔ´Ï´Ù.");
		}
		else if(gildong >=80 && gildong < 90) 
		{
			System.out.println("È«±æµ¿ : BÇÐÁ¡ ÀÔ´Ï´Ù.");
		}
		else if(gildong >=70 && gildong < 80) 
		{
			System.out.println("È«±æµ¿ : CÇÐÁ¡ ÀÔ´Ï´Ù.");
		}
		else if(gildong >=60 && gildong < 70) 
		{
			System.out.println("È«±æµ¿ : DÇÐÁ¡ ÀÔ´Ï´Ù.");
		}
		else 
		{
			System.out.println("ÄÆ");
		}
	}
}



