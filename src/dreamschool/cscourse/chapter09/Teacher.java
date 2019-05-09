package dreamschool.cscourse.chapter09;

public class Teacher extends Person{
	String subject;
	
	public Teacher(String name, String phoneNumber , String subject) {
		super(name,phoneNumber);
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println("수업함");
	}
	
	@Override
	public void eat() {
		System.out.println("다같이 먹어라");
	}

}
