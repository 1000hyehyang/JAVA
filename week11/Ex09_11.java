import java.util.Scanner;

public class Ex09_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[]stack = new char[5];
		int top = 0;
		
		char carName = 'A';
		int select = 9;
		
		while (select !=3) {
			System.out.printf("<1> �ڵ��� �ֱ� <2> �ڵ��� ���� <3> �� : ");
			select = sc.nextInt();
			
			switch(select){
			case 1:
				if(top>=5) {
					System.out.printf("�ͳ��� �� á���ϴ�.\n");
				}else {
					stack[top]=carName++;
					System.out.printf(" %c �ڵ����� �ͳο� �����ϴ�.\n", stack[top]);
					top++;
				}
				break;
				
			case 2:
				if(top<1) {
					System.out.printf("�������� �ڵ����� �����ϴ�.\n");
				}else {
					top--;
					System.out.printf(" %c �ڵ����� �ͳ��� �����������ϴ�.\n", stack[top]);
					stack[top] = ' ';
					
				}
				break;
				
			case 3:
				System.out.printf("���� �ͳο� %d�밡 �ֽ��ϴ�.\n",top);
				System.out.printf("���α׷��� �����մϴ�.\n");
				break;
				
				default:
					System.out.printf("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}

	}

}
