package dreamschool.cscourse.chapter04;

public class GradeTest {

	public static void main(String[] args) 
	{
		int score = 45;
		
		System.out.println("A����"+(score >= 90 && score <= 100));
		System.out.println("B����"+(score >= 80 && score <= 90));
		System.out.println("C����"+(score >= 70 && score <= 80));
		System.out.println("D����"+(score >= 60 && score <= 70));
		System.out.println("E����"+(score >= 50 && score <= 60));
		System.out.println("F����"+(score >= 40 && score <= 50));
	}

}
