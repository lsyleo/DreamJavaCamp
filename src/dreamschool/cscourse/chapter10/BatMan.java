package dreamschool.cscourse.chapter10;

public class BatMan extends Hero {
	public void action() {
		System.out.print(this.toString() + "이 ");
		swim();
		System.out.print(this.toString() + "이 "); 
		fight();
		
	}
	public String toString() {
		return "베트맨";
	}
}
