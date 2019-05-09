package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay{
	private String osVersion;

	public Galaxy(String production , String osVersion) {
		super(production);
		this.osVersion = osVersion;
		// TODO Auto-generated constructor stub
	}
	
	public void charge(int time) {
		System.out.println("GALAXY : 보조 배터리 "+time+"분 충전");
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : "+ kind +" 앱을 "+price+"원에 구입했습니다.");
		
	}
	
	

}
