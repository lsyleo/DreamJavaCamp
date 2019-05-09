package dreamschool.cscourse.chapter10;

public class Animal implements Flyable{
	private String kind;
	private int age;
	public Animal(String kind, int age) {
		super();
		this.kind = kind;
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void fly() {
		System.out.println("날아간다.");
		
	}
	@Override
	public void spreadWings() {
		System.out.println("날개를 핀다.");
		
	}
	
	

}
