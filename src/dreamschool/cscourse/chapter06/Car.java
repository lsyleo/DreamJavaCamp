package dreamschool.cscourse.chapter06;

public class Car {
	
	String name ="DreamCar";
	int remainOil;
	double totalDistance;
	
	void addOil(int oil) {
		if(oil < 0) {
			System.out.println("[오류]음수 입력 ㄴㄴ");
			return;
		}
		if(oil + remainOil > 20) {
			System.out.println("[오류] 가득참");
			return;
		}
		else {
			remainOil += oil;
		}
		System.out.println(oil + "만큼 주유합니다");
		
		
	}
	
		void printCarInfo() {
			System.out.println("["+name  +"]남은 기름양 :" + remainOil + "L, 총 주행거리 : "+totalDistance+"km");
		}
		void driveCar(String startPoint, String endPoint, double driveDistance) {
			System.out.println(startPoint +"에서 "+ endPoint + "까지" + driveDistance +"km 주행했습니다");
			totalDistance += driveDistance;
			remainOil -= (int)(driveDistance / 20);
			
			
			
		}
		void canDriveDistance() {
			
			System.out.println("주행가능한 거리는 약 "+remainOil * 20 + "km 입니다");
			
		}
	

}
