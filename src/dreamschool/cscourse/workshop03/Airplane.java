package dreamschool.cscourse.workshop03;

public class Airplane extends Vehicle{
	private int numOfEngine;
	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super(modelName,maxSpeed,numberLimit);
		this.numOfEngine = numOfEngine;
	}
	
	


	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + this.getModelName());
		System.out.println(" �ְ�ӵ� : " + this.getMaxSpeed() + "km/h");
		System.out.println(" �ִ����� : " + this.getNumberLimit() + "��");
		System.out.println(" �������� : " + numOfEngine + "��");
	}
}
