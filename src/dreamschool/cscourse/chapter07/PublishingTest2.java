package dreamschool.cscourse.chapter07;

public class PublishingTest2 {

	public static void main(String[] args) {
		Publication samgook = new Publication("만화 삼국지", 5000, 300);
		Publication piStory = new Publication("만화 삼국지", 8400, 280);
		
		Publication.printHeader();
		samgook.printBookInfo();
		piStory.printBookInfo();
		
		
		

	}

}
