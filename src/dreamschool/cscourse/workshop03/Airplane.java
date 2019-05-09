package dreamschool.cscourse.workshop03;

public class Airplane extends Vehicle{
	private int numOfEngine;
	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super(modelName,maxSpeed,numberLimit);
		this.numOfEngine = numOfEngine;
	}
	
	


	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + this.getModelName());
		System.out.println(" 최고속도 : " + this.getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + this.getNumberLimit() + "명");
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}
