package dreamschool.cscourse.chapter06;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String author){
		this.author = author;
		
	}
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	public Book(String title, String author,int price) {
		this(title,author);
		this.price = price;
	}
	
	public void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
	}

}
