package dreamschool.cscourse.chapter06;

public class studentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.name = "ȫ�浿";
		stu.studentNum = "S001";
		stu.korean = 94;
		stu.english = 80;
		stu.math = 89;
		
		stu.changeStudentNum("STU0001");
		stu.printInfo();

	}

}
