package dreamschool.cscourse.chapter09;

public class InHerTest {

	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿","123-4567","��ǻ�� ���а�");
		Teacher tea = new Teacher("ȫ�浿","333-4567","��ǻ�� ���а�");
		Person per = new Person("������","4567-7812");
		
		System.out.println("=====Student=====");
		stu.study();
		stu.eat();
		
		System.out.println("====Teacher====");
		tea.teach();
		tea.eat();
	}

}
