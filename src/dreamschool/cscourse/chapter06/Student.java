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
		System.out.println("�л� �̸� : "+ name);
		System.out.println(("�й� : "+studentNum));
		System.out.println("���� ���� : "+ korean + "\n ���� ���� : "+ math + "\n �������� : "+ english);
		System.out.println("������� : "+ calculateAvg());
		return;
	}
	void changeStudentNum(String newNum) {
		studentNum = newNum;
		
		
	}

}
