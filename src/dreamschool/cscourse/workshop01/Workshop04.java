package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int cafeLatte = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int baygles = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamCheese = getUserInput();
        
        System.out.println( "========= �ݾ� =========" );
        
        System.out.println( " �Ƹ޸�ī�� : " + americano * 2000+"��");
        System.out.println( " ī��� : " + cafeLatte * 3000+"��");
        System.out.println( " �Ƹ޸�ī�� : " + baygles * 1500+"��");
        System.out.println( " �Ƹ޸�ī�� : " + americano * 500+"��");
        int sum = americano *  2000 + cafeLatte * 3000 + baygles * 1500 + creamCheese * 500;
        
        System.out.println( "======================" );
        
        System.out.println( " �� ���� �ݾ� : " + sum +"��");
        int bonus = 0;
        if(sum >= 30000) {
        	bonus = sum / 100 * 2;
        	
        	
        }
        else if(sum < 30000) {
        	bonus = sum / 100 * 1;
        }
        else {
        	bonus = 0;
        }
        
        System.out.println(" ����Ʈ ���� : "+bonus + "��");
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
