package dreamschool.cscourse.chapter10;

public class Student extends Person{
	private String department;
	
	public Student(String name, String phoneNumber,String department) {
		super(name, phoneNumber);
		this.department = department;
	}
	
	@Override
	public void eat() {
		
		System.out.println("조별로 머어요");
		
	}
	
	public void study() {
		System.out.println("공부함");
	}

}
