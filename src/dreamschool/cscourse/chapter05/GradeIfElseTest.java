package dreamschool.cscourse.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int gildong = 100;
		
		
		if(gildong >=90 && gildong <= 100) 
		{
			System.out.println("ȫ�浿 : A���� �Դϴ�.");
		}
		else if(gildong >=80 && gildong < 90) 
		{
			System.out.println("ȫ�浿 : B���� �Դϴ�.");
		}
		else if(gildong >=70 && gildong < 80) 
		{
			System.out.println("ȫ�浿 : C���� �Դϴ�.");
		}
		else if(gildong >=60 && gildong < 70) 
		{
			System.out.println("ȫ�浿 : D���� �Դϴ�.");
		}
		else 
		{
			System.out.println("��");
		}
	}
}



