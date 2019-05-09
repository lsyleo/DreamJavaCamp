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
		System.out.println(" �� �� �� : " + this.getModelName());
		System.out.println(" �ְ�ӵ� : " + this.getMaxSpeed() + "km/h");
		System.out.println(" �ִ����� : " + this.getNumberLimit() + "��");
		System.out.println(" ��տ��� : " + mileage + "km/l");
	}
}
