package dreamschool.cscourse.chapter10;

public class SuperMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "�� ");
		fly();
		System.out.print(this.toString() + "�� ");
		swim();
		System.out.print(this.toString() + "�� "); 
		fight();
	}
	
	public String toString() {
		return "���۸�";
	}
}
