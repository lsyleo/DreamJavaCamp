package dreamschool.cscourse.chapter10;

public class IPhone extends Mobile{
	private String color;
	
	
	
	public IPhone(String production,String color) {
		super(production);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void charge(int t) {
		System.out.println("IPHONE : "+t +"분 충전했더니 Full!!");
	}

	

}
