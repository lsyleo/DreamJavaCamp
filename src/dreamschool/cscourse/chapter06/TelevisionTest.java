package dreamschool.cscourse.chapter06;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv1 = new Television("INFINIA",1500000);
		Television tv2 = new Television("XCANVAS","LCD TV",1000000);
		Television tv3 = new Television("INFINIA","3D TV",2000000);
		
		tv1.printTelevisionInfo();
		tv2.printTelevisionInfo();
		tv3.printTelevisionInfo();
		System.out.println("가격의 합 : "+ (tv1.price + tv2.price + tv3.price));
		
		

	}

}
