package dreamschool.cscourse.chapter06;

public class ComputeTest {
	public static void main(String[] args) {
		Computer com1 = new Computer("R500","Win 7",100);
		Computer com2 = new Computer("R500","Win 7",100,30);
		
		com1.printComputerInfo();
		com2.printComputerInfo();
	}

}
