package dreamschool.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        
        double computerScience = getUserInput();
        
        boolean cs = computerScience * 10 > 2.5;
        
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        
        double javaProgramming = getUserInput();
        boolean jp = computerScience > 2.5;
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double math = getUserInput();
        boolean ma = math > 2.5;
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double opera = getUserInput();
        boolean op = opera > 2.5;
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double bedmiton = getUserInput();
        boolean bm = bedmiton > 2.5;
        System.out.println( "==============================" );
        double avg = (computerScience + javaProgramming + math + opera + bedmiton)/5;
        System.out.println( "������ "+avg+"�� �Դϴ�." );
        
        if(cs == true && jp ==true && ma ==true && op==true && bm == true) {
        	System.out.println("�����б� ���б� ����� �Դϴ�");
        }
        else {
        	System.out.println("���б� ��");
        }
        
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
