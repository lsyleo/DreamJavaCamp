package dreamschool.cscourse.chapter06;

public class Car {
	
	String name ="DreamCar";
	int remainOil;
	double totalDistance;
	
	void addOil(int oil) {
		if(oil < 0) {
			System.out.println("[����]���� �Է� ����");
			return;
		}
		if(oil + remainOil > 20) {
			System.out.println("[����] ������");
			return;
		}
		else {
			remainOil += oil;
		}
		System.out.println(oil + "��ŭ �����մϴ�");
		
		
	}
	
		void printCarInfo() {
			System.out.println("["+name  +"]���� �⸧�� :" + remainOil + "L, �� ����Ÿ� : "+totalDistance+"km");
		}
		void driveCar(String startPoint, String endPoint, double driveDistance) {
			System.out.println(startPoint +"���� "+ endPoint + "����" + driveDistance +"km �����߽��ϴ�");
			totalDistance += driveDistance;
			remainOil -= (int)(driveDistance / 20);
			
			
			
		}
		void canDriveDistance() {
			
			System.out.println("���డ���� �Ÿ��� �� "+remainOil * 20 + "km �Դϴ�");
			
		}
	

}
