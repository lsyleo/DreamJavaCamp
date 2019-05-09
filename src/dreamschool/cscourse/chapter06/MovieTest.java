package dreamschool.cscourse.chapter06;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie("트렌스 포머4","마이클 베이");
		Movie movie3 = new Movie("아바타","제임스 카메론","SF");
		
		movie1.printInfo();
		movie2.printInfo();
		movie3.printInfo();

	}

}
