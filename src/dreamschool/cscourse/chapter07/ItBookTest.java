package dreamschool.cscourse.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sQL = new ItBook("SQL Plus",50000,5.5);
		ItBook java = new ItBook("Java 2.0",50000,5.5);
		ItBook jsp = new ItBook("JSP Servlet",50000,5.5);
		
		sQL.printInfo();
		java.printInfo();
		jsp.printInfo();
		
		sQL.setPrice(55000);
		sQL.setDiscountRate(9.5);
		sQL.printInfo();
		
		java.setPrice(33000);
		java.printInfo();
		
		jsp.setTitle("Servelt & JSP");
		jsp.setDiscountRate(12.6);
		
		
		

	}

}
