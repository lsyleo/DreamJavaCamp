package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3,"�丣�þ�","�߿���");
		
		System.out.println(cat);
		
		cat.printInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		Dog dog = new Dog(2,"�����","�ú������㽺Ű");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getKind());
	}

}
