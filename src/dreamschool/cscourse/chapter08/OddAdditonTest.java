package dreamschool.cscourse.chapter08;

public class OddAdditonTest {

	public static void main(String[] args) {
		int[] nums = {10,21,33,42,51,64,79,80};
		int sum =0;
		for(int i = 0; i < nums.length ; i++) {
			if(nums[i] % 2 != 0) {
				sum += nums[i];
			}
		}
		System.out.println("홀수들의 합계는 :"+sum+"입니다");

	}

}
