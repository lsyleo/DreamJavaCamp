package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car dCar = new Car();
		dCar.name = "꿈교카";
		dCar.remainOil = 5;
		dCar.totalDistance = 140.0;
		
		dCar.printCarInfo();
		dCar.addOil(10);
		
		dCar.driveCar("it센터", "인천공항", 10.17);
		dCar.printCarInfo();
		
		dCar.driveCar("인천공항", "곤지암리조트", 60.21);
		dCar.printCarInfo();
		dCar.canDriveDistance(); 
		
		

	}

}
