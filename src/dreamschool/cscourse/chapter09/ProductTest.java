package dreamschool.cscourse.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product washing = new Product("�뵹��",450000,8);
		Television tv = new Television("�ó׸� TV",3500000,10,"ȭ��ũ�� 151cm");
		
		System.out.println("=====��ǰ����=====");
		washing.printProductInfo();
		
		System.out.println("--------------");
		tv.printInfo();
		

	}

}
