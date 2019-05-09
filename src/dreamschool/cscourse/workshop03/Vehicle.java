package dreamschool.cscourse.workshop03;

public class Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean aviliable;
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	public void displayInfo() {

		System.out.println(this.modelName);
		System.out.println(this.maxSpeed);
		System.out.println(this.numberLimit);
	}
	
	
	
	
	

}
