package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int ans = 0;
		int compNo = getHiddenNumber();
		System.out.println(compNo);
		
		for(int chance = 1; chance <= 10; chance++) {
			System.out.print(chance+"번째 기회입니다. 숫자를 입력하세요 : ");
			ans = getUserInput();
			if(ans == compNo) {
				System.out.println("축하합니다!! \n종료합니다. Bye~ Bye~");
				break;
			}
			else if(compNo < ans) {
				System.out.println(ans+"보다 작습니다");
				
			}
			else {
				System.out.println(ans+"보다 큽니다");
			}
			if(chance == 10) {
				System.out.println("컷");
			}
			
		}
		
		
		

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
