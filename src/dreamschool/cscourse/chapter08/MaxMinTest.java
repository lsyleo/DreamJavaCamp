package dreamschool.cscourse.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] num = {12,53,24,10,22,38,64,39};
		int max= num[0];
		int min= num[0];
		
		System.out.print("�迭������ : ");
		for(int i = 0;i < num.length ; i++) {
			
			if(num[i] > max) {
				max = num[i];
			}
			if(num[i] < min) {
				min = num[i];
			}
			if(i != num.length 
					-1) {
				System.out.print(num[i]+",");
			}else {
				System.out.println(num[i]);
			}
			
		}
		
		System.out.println("�ִ밪 : "+ max);
		System.out.println("�ּڰ� : "+min);
		
	}

}
