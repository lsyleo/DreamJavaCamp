package dreamschool.cscourse.chapter10;

public class SpiderMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "이 "); 
		fight();
	}
	public String toString() {
		return "스파이더맨";
	}
}
