package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int ans = 0;
		int compNo = getHiddenNumber();
		System.out.println(compNo);
		
		for(int chance = 1; chance <= 10; chance++) {
			System.out.print(chance+"��° ��ȸ�Դϴ�. ���ڸ� �Է��ϼ��� : ");
			ans = getUserInput();
			if(ans == compNo) {
				System.out.println("�����մϴ�!! \n�����մϴ�. Bye~ Bye~");
				break;
			}
			else if(compNo < ans) {
				System.out.println(ans+"���� �۽��ϴ�");
				
			}
			else {
				System.out.println(ans+"���� Ů�ϴ�");
			}
			if(chance == 10) {
				System.out.println("��");
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
