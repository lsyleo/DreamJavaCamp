package dreamschool.cscourse.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int gildong = 100;
		
		
		if(gildong >=90 && gildong <= 100) 
		{
			System.out.println("홍길동 : A학점 입니다.");
		}
		else if(gildong >=80 && gildong < 90) 
		{
			System.out.println("홍길동 : B학점 입니다.");
		}
		else if(gildong >=70 && gildong < 80) 
		{
			System.out.println("홍길동 : C학점 입니다.");
		}
		else if(gildong >=60 && gildong < 70) 
		{
			System.out.println("홍길동 : D학점 입니다.");
		}
		else 
		{
			System.out.println("컷");
		}
	}
}



