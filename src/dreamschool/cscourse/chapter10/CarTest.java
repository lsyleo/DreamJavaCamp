package dreamschool.cscourse.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = new Car[2];
		
		cars[0] = new Taxi();
		cars[1] = new Truck();
		
		((Taxi)cars[0]).setMaxNum(4);
		((Truck)cars[1]).setMaxWeight(100);
		cars[0].setOilSize(10);
		cars[1].setOilSize(10);
		
		cars[0].go(20);
		System.out.println("연료 :" + cars[0].getOilSize());
		System.out.println(((Taxi)cars[0]).getMaxNum());
		
		cars[1].go(30);
		System.out.println("연료 :" + cars[1].getOilSize());
		System.out.println(((Truck)cars[1]).getMaxWeight()+"kg");

	}

}
