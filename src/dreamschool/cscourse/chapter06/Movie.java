package dreamschool.cscourse.chapter06;

public class Movie {
	String title;
	String director;
	String genre;
	public Movie() {
		
	}
	public Movie(String title, String director) {
		
		this.title = title;
		this.director = director;
		
	}
	public Movie(String title, String director, String genre) {
		
		this.title = title;
		this.director = director;
		this.genre = genre;
		
	}
	public void printInfo() {
		System.out.println(title);
		System.out.println(director);
		System.out.println(genre);
	}
	
	
}
