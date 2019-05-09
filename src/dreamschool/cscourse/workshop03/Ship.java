package dreamschool.cscourse.workshop03;

public class Ship extends Vehicle{
	
	private int replacement;
	private boolean available;
	
	
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(modelName, maxSpeed, numberLimit);
		this.replacement = replacement;
		
	}




	


	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.replacement);
	}
}
