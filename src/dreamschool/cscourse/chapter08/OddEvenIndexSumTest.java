package dreamschool.cscourse.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int[] num = {12,53,24,10,22,38,64,39};
		int even = 0;
		int odd = 0;
		//12 + 24 + 22 + 64
		//54 + 10 + 38 + 39
		System.out.println("배열 데이터");
		
		for(int i = 1; i < num.length + 1 ; i++) {
			if(i % 2 == 0) {
				even += num[i-1];
			}
			else {
				System.out.println(i);
				odd += num[i-1];
			}
			if(i != num.length ) {
				System.out.print(num[i-1]+",");
			}else {
				System.out.println(num[i-1]);
			}
			
		}
		System.out.println("홀수 번째 정수의  합 : "+odd);
		System.out.println("짝수 번째 정수의  합 : "+even);
		
	}

}
