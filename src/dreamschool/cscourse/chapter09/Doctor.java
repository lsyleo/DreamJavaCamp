package dreamschool.cscourse.chapter09;

public class Doctor {
	private String name;
	private String department;
	
	public Doctor(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}


	public String getDepartment() {
		return department;
	}

	public void treatPatient() {
		System.out.println("환자를 진료합니다");
	}
	
	public void printInfo() {
		System.out.println(this.getDepartment()+" : "+this.getName()+" 선생님");
		
	}
	
	

}
