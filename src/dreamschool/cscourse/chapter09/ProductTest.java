package dreamschool.cscourse.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product washing = new Product("통돌이",450000,8);
		Television tv = new Television("시네마 TV",3500000,10,"화면크기 151cm");
		
		System.out.println("=====제품정보=====");
		washing.printProductInfo();
		
		System.out.println("--------------");
		tv.printInfo();
		

	}

}
