package dreamschool.cscourse.chapter10;

public class CarTest02 {
	public static void main(String[] args) {
		//Car[] cars = new Car[2];
		
		Washer[] cars = new Washer[2];
		
		cars[0] = new Taxi();
		
		cars[0].wash();
		System.out.println(cars[0].getOilSize()); 
		
		cars[1]= new Truck();
		
		System.out.println();
		
	}
	
	
	

}
