package dreamschool.cscourse.chapter05;

public class CoditionIfElseIfEx {

	public static void main(String[] args) {
		int age = 2;
		
		if(age >= 19) 
		{
			System.out.println("성인입니다");
		}
		else if(age >= 13) 
		{
			System.out.println("청소년 입니다");
		}
		else {
			System.out.println("아동입니다");
		}
	}

}
