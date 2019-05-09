package dreamschool.cscourse.chapter06;

public class ProductTest {
	public static void main(String[] args) {
		
		Product mix = new Product("Ä¿ÇÇ¹Í½º",12000,20);
		Product cup = new Product("Á¾ÀÌÄÅ",3000);
		
		mix.printInfo();
		cup.printInfo();
	}

}
