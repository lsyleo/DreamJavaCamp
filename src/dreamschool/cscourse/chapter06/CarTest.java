package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car dCar = new Car();
		dCar.name = "�ޱ�ī";
		dCar.remainOil = 5;
		dCar.totalDistance = 140.0;
		
		dCar.printCarInfo();
		dCar.addOil(10);
		
		dCar.driveCar("it����", "��õ����", 10.17);
		dCar.printCarInfo();
		
		dCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		dCar.printCarInfo();
		dCar.canDriveDistance(); 
		
		

	}

}
