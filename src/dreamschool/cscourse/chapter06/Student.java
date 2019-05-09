package dreamschool.cscourse.chapter06;

public class Student {
	String name;
	String studentNum;
	int korean;
	int english;
	int math;
	
	double calculateAvg() {
		double avg = (korean + english + math) / 3.0;
		
		
		return avg;
	}
	void  printInfo() {
		System.out.println("학생 이름 : "+ name);
		System.out.println(("학번 : "+studentNum));
		System.out.println("국어 점수 : "+ korean + "\n 수학 점수 : "+ math + "\n 영어점수 : "+ english);
		System.out.println("평균점수 : "+ calculateAvg());
		return;
	}
	void changeStudentNum(String newNum) {
		studentNum = newNum;
		
		
	}

}
