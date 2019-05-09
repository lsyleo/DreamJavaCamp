package dreamschool.cscourse.chapter08;

public class Student {
	String name;
	String studentID;
	String phoneNum;
	
	
	
	public Student(String name, String studentID, String phoneNum) {
		
		this.name = name;
		this.studentID = studentID;
		this.phoneNum = phoneNum;
	}



	void printStudentInfo() {
		System.out.println(this.name+"("+this.studentID+") / 전화번호 : "+this.phoneNum);
	}
}
