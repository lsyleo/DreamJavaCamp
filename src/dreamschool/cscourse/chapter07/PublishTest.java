package dreamschool.cscourse.chapter07;

public class PublishTest {

	public static void main(String[] args) {
		Publication book = new Publication();
		Publication book2 = new Publication();
		
		System.out.println(book);
		System.out.println(book2);
		
		System.out.println("===== 출판물 정보를 세팅 합니다.=====");
		book.setPrice(-100);
		book.setPage(-100);
		
		book.setPage(100);
		book.setPrice(5000);
		book.setTitle("맨 니");
		System.out.println("출판물 정보 :"+book.getTitle()+" (" +book.getPrice() +" 원,"+book.getPage()+ "page )");
		

	}

}
