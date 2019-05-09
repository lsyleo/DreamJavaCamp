package dreamschool.cscourse.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 85;
		
		if(score > 100 || score < -1) 
			System.out.println("점수를 잘못 입력하였습니다");
		if(score >= 90)
		{
			System.out.println("A학점 입니다.");
		}
		else if(score >= 80) {
			System.out.println("B학점 입니다");
		}
		else if(score >= 70) {
			System.out.println("B학점 입니다");
		}
		else if(score >= 60 ) {
			System.out.println("B학점 입니다");
		}
		else if(score >= 50) {
			System.out.println("B학점 입니다");
		}
		else
		{
			System.out.println("컷");
		}

	}

}
