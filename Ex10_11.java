import java.util.Scanner;

public class Ex10_11 {

	static int coffee_machine(int button){
		
		System.out.printf("\n#1. (�ڵ�����)�߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("#2. (�ڵ�����)�������� �غ��Ѵ�\n");
		
		switch(button) {
		case 1:
			System.out.printf("#3. (�ڵ�����)����Ŀ�Ǹ� ź��\n"); break;
		case 2:
			System.out.printf("#3. (�ڵ�����)����Ŀ�Ǹ� ź��\n"); break;
		case 3:
			System.out.printf("#3. (�ڵ�����)��Ŀ�Ǹ� ź��\n"); break;
		default:
			System.out.printf("#3. (�ڵ�����)�ƹ��ų� ź��\n"); break;
		}
		System.out.printf("#4.(�ڵ�����)���� �״´�\n\n");
		System.out.printf("#5.(�ڵ�����)��Ǭ���� ��� ���δ�\n");
		
		return 0;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.printf("A��, � Ŀ�Ǹ� �帱���? 1.����, 2.����, 3.��");
		coffee = sc.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("A�� �ֹ��Ͻ� Ŀ�� ���Խ��ϴ�~\n\n");
		
		System.out.printf("B��, � Ŀ�Ǹ� �帱���? 1.����, 2.����, 3.��");
		coffee = sc.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("B�� �ֹ��Ͻ� Ŀ�� ���Խ��ϴ�~\n\n");
		
		System.out.printf("C��, � Ŀ�Ǹ� �帱���? 1.����, 2.����, 3.��");
		coffee = sc.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("C�� �ֹ��Ͻ� Ŀ�� ���Խ��ϴ�~\n\n");
	}

}
