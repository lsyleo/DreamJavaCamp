package dreamschool.cscourse.workshop03;

public class Car extends Vehicle{
	private int mileage;
	private boolean available;
	
	
	



	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
		this.available = available;
	}






	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + this.getModelName());
		System.out.println(" 최고속도 : " + this.getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + this.getNumberLimit() + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
}
