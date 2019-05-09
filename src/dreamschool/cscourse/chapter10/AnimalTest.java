package dreamschool.cscourse.chapter10;

public class AnimalTest {
	public static void main(String[] args) {
		Animal bird1 = new Bird("독수리",3,"바위산등");
		
		System.out.println(bird1.getKind()+"( "+bird1.getAge()+"살 : "+((Bird)bird1).getHabitat());
		bird1.spreadWings();
		bird1.fly();
		
		
		
	}

}
