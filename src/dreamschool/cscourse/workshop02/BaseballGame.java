package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		//숫자의 자리가 모두 다른 숫자가 나올때까지 계속 돌린다 
		int count = 0; int strike = 0; int ball = 0;//맞춘 횟수를 언흔ㄴ다. 몊번만에 맞춘 횟수
		int comNum1 = 0; int comNum2 = 0; int comNum3 = 0;
		int myNum1 = 0; int myNum2 = 0; int myNum3 = 0;
		
		
		int compNo = getHiddenNumber();
		
		if(checkNumber(compNo) == false) {
			
			while(!checkNumber(compNo)) {
				
				compNo = getHiddenNumber();
				
			}
			
		}
		System.out.println(compNo);
		comNum1 = compNo / 100; comNum2 = compNo % 100 / 10; comNum3 = compNo % 10;
		
		while(true){
			
			
			
			System.out.print("숫자를 입력하세요 : ");
			
			
			int myNum = getUserInput();
			
			if(checkNumber(myNum) != true) {
				
				while(checkNumber(myNum) != true) {
					System.out.print("숫자를 다시 입력하세요:");
					myNum = getUserInput();
				}
				
			}
			myNum1 = myNum / 100; myNum2 = myNum % 100 / 10; myNum3 = myNum % 10;
			
			if(myNum == compNo) {
				System.out.println("OUT 축하합니다"+count+"번만에 맞추셨군요");
				break;
			}
			else if(myNum1 == comNum1) {
				strike++;
			}
			else if(myNum1 == comNum2 || myNum1 == comNum3) {
				ball++;
			}
			
			else if(myNum2 == comNum2) {
				strike++;
			}
			else if(myNum2 == comNum3 || myNum3 == comNum1) {
				ball++;
			}
			if(myNum3 == comNum3) {
				strike++;
			}
			else if(myNum3 == comNum2 || myNum3 == comNum1) {
				ball++;
			}
			
			/*
			for(int i = 1; i <= 3; i++) {
				
				int iNum = 0;
				
				if(i == 0) {
					 iNum = comNum1;
					 
				}
				else if(i == 1){
					 iNum = comNum2;
					 
				}
				else if(i == 2) {
					iNum = comNum3;
					
				}
				
				for(int j = 1; j <= 3; j++) {
					
					int jNum = 0;
					
					if(j == 1) {
						 jNum = myNum1;
						 
					}
					else if(j == 2){
						 jNum = myNum2;
						 
					}
					else if(j == 3) {
						jNum = myNum3;
						
					}
					
					System.out.println(i);
					System.out.println(j);
					if(iNum == jNum && i == j) {
						++strike;
						System.out.println("스트라이크요");
						break;
					}
					else if(iNum == jNum && i != j) {
						++ball;
						System.out.println("볼이유");
					}
					
					System.out.println("j포문 끝");
					
				}
				*/
			
			
			++count;
			System.out.println("스트라이크 : "+strike);
			System.out.println("볼 : " + ball);
			
			strike = 0;
			ball = 0;
			if(strike >= 3) {
				System.out.println("OUT 축하합니다"+count+"번만에 맞추셨군요");
				break;
			}
			else if(ball >= 3) {
				System.out.println("컷");
				break;
			}
			
		}
		
		
		
		
		
		//사용자가 입력한 숫자의 자리가 모두 다른 숫자가 나올때까지 계속 돌리다.
		
		//compNo와 myNum을 비교한다
	}
	public static boolean checkNumber(int number) {
		boolean check = false;
		if(number / 100 != number % 100 / 10 && number / 100 != number % 10 && number % 100 /10 != number % 10 && number /100 != 0) {
			check = true;
		}
		else {
			check = false;
		}
		
		//세자리 모두 다른 숫자 인가 체크하는 로직
		
		return check;// 일부로 true로 사용함
	}
	
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(988);
		return num;
	}
	
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }
	

}
