import java.util.Scanner;

public class Ex06_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("1~4 �߿� �����ϼ���: ");
		a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.printf("1�� �����ϼ̽��ϴ�\n");
		break;
		case 2:
			System.out.printf("2�� �����ϼ̽��ϴ�\n");
		break;
		case 3: 
			System.out.printf("3�� �����ϼ̽��ϴ�\n");
			break;
		case 4:
			System.out.printf("4�� �����ϼ̽��ϴ�\b");
			break;
			default:
				System.out.printf("��Ű���� ���� ���� �����߱�\n");
			
		}

	}

}
