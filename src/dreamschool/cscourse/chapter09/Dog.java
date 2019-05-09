package dreamschool.cscourse.chapter09;

public class Dog extends Animal{
	
	private String name;

	public Dog(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void hunt() {
		System.out.println("�ü� 40km�� �پ�");
	}
	@Override
	public void run() {
		System.out.println("������ ��ӿ�~");
	}
	
	

}
