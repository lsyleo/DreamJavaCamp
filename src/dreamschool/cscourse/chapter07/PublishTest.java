package dreamschool.cscourse.chapter07;

public class PublishTest {

	public static void main(String[] args) {
		Publication book = new Publication();
		Publication book2 = new Publication();
		
		System.out.println(book);
		System.out.println(book2);
		
		System.out.println("===== ���ǹ� ������ ���� �մϴ�.=====");
		book.setPrice(-100);
		book.setPage(-100);
		
		book.setPage(100);
		book.setPrice(5000);
		book.setTitle("�� ��");
		System.out.println("���ǹ� ���� :"+book.getTitle()+" (" +book.getPrice() +" ��,"+book.getPage()+ "page )");
		

	}

}
