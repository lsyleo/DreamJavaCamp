package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3,"其福矫救","具克捞");
		
		System.out.println(cat);
		
		cat.printInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		Dog dog = new Dog(2,"大大捞","矫海府救倾胶虐");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getKind());
	}

}
