package dreamschool.cscourse.workshop01;

public class Workshop06 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			
			for(int dan = 2; dan <= 9; dan++) {
				
				if(dan != 9) {
					
					System.out.print(dan + " * " + i + " = " + i * dan + ",\t");
					
				}
				else {
					
					System.out.print(dan + " * " + i + " = " + i * dan);
					
				}
			
			}
			System.out.println();
			
			
		}
	}

}
