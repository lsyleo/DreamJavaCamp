package dreamschool.cscourse.chapter05;

public class GuGuDanOlddNumberTest {

	public static void main(String[] args) {
		
		for(int dan = 2;dan <= 5;dan++) {
			for(int j = 1; j <=9; j++) {
				if(dan * j % 2 != 0) {
					System.out.println(dan +" X "+ j +" = "+(dan*j));
				}
				
			}
			
		}

	}

}
