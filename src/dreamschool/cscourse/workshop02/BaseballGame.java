package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		//������ �ڸ��� ��� �ٸ� ���ڰ� ���ö����� ��� ������ 
		int count = 0; int strike = 0; int ball = 0;//���� Ƚ���� ���礤��. �s������ ���� Ƚ��
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
			
			
			
			System.out.print("���ڸ� �Է��ϼ��� : ");
			
			
			int myNum = getUserInput();
			
			if(checkNumber(myNum) != true) {
				
				while(checkNumber(myNum) != true) {
					System.out.print("���ڸ� �ٽ� �Է��ϼ���:");
					myNum = getUserInput();
				}
				
			}
			myNum1 = myNum / 100; myNum2 = myNum % 100 / 10; myNum3 = myNum % 10;
			
			if(myNum == compNo) {
				System.out.println("OUT �����մϴ�"+count+"������ ���߼̱���");
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
						System.out.println("��Ʈ����ũ��");
						break;
					}
					else if(iNum == jNum && i != j) {
						++ball;
						System.out.println("������");
					}
					
					System.out.println("j���� ��");
					
				}
				*/
			
			
			++count;
			System.out.println("��Ʈ����ũ : "+strike);
			System.out.println("�� : " + ball);
			
			strike = 0;
			ball = 0;
			if(strike >= 3) {
				System.out.println("OUT �����մϴ�"+count+"������ ���߼̱���");
				break;
			}
			else if(ball >= 3) {
				System.out.println("��");
				break;
			}
			
		}
		
		
		
		
		
		//����ڰ� �Է��� ������ �ڸ��� ��� �ٸ� ���ڰ� ���ö����� ��� ������.
		
		//compNo�� myNum�� ���Ѵ�
	}
	public static boolean checkNumber(int number) {
		boolean check = false;
		if(number / 100 != number % 100 / 10 && number / 100 != number % 10 && number % 100 /10 != number % 10 && number /100 != 0) {
			check = true;
		}
		else {
			check = false;
		}
		
		//���ڸ� ��� �ٸ� ���� �ΰ� üũ�ϴ� ����
		
		return check;// �Ϻη� true�� �����
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
