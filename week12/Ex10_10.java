import java.util.Scanner;
public class Ex10_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coffee;
		
		System.out.printf("� Ŀ�Ǹ� �帱���? 1:����, 2:����, 3:��");
		coffee = sc.nextInt();
		
		System.out.printf("\n#1. �߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("#2. �������� �غ��Ѵ�\n");
		
		switch(coffee) {
		case 1:
			System.out.printf("#3. ����Ŀ�Ǹ� ź��\n"); break;
		case 2:
			System.out.printf("#3. ���� Ŀ�Ǹ� ź��\n"); break;
		case 3:
			System.out.printf("#3. ��Ŀ�Ǹ� ź��\n"); break;
		default:
			System.out.printf("#3. �ƹ��ų� ź��\n"); break;
		}
		
		System.out.printf("#4. ���� �״´�\n");
		System.out.printf("#5. ��Ǭ���� ��� ���δ�\n\n");
		
		System.out.printf("000�� ����~ �ֹ��Ͻ� Ŀ�� ���Խ��ϴ�~\n");
		//�մ��� ������ ��� �ڵ带 �ݺ��ؾ���. ���� �ſ� ��ȿ������
	}

}
