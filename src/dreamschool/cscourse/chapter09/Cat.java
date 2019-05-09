package dreamschool.cscourse.chapter09;

public class Cat extends Animal{
	private String name;
	
	

	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name +"��ü�� ȣ��Ǿ��מ�����������";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hunt() {
		System.out.println("�㸦 �����ž�");
	}
	public void play() {
		System.out.println("��� ���̰� ���ƿ�");
	}
	
	public void printInfo() {
		System.out.println("�̸� : "+this.getName());
		System.out.println("���� : "+this.getAge());
		System.out.println("���� : "+this.getKind());
	}
}
