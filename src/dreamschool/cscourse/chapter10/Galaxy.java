package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay{
	private String osVersion;

	public Galaxy(String production , String osVersion) {
		super(production);
		this.osVersion = osVersion;
		// TODO Auto-generated constructor stub
	}
	
	public void charge(int time) {
		System.out.println("GALAXY : ���� ���͸� "+time+"�� ����");
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : "+ kind +" ���� "+price+"���� �����߽��ϴ�.");
		
	}
	
	

}
