package dreamschool.cscourse.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 85;
		
		if(score > 100 || score < -1) 
			System.out.println("������ �߸� �Է��Ͽ����ϴ�");
		if(score >= 90)
		{
			System.out.println("A���� �Դϴ�.");
		}
		else if(score >= 80) {
			System.out.println("B���� �Դϴ�");
		}
		else if(score >= 70) {
			System.out.println("B���� �Դϴ�");
		}
		else if(score >= 60 ) {
			System.out.println("B���� �Դϴ�");
		}
		else if(score >= 50) {
			System.out.println("B���� �Դϴ�");
		}
		else
		{
			System.out.println("��");
		}

	}

}
