import java.util.Scanner;

public class Ex08_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("\n �մ� �ֹ��Ͻðڽ��ϱ�? \n");
			System.out.printf("<1>�Ƹ޸�ī�� <2>ī���<3>īǪġ��<4>�׸� �ҷ��� = > ");
			
			menu = sc.nextInt();
			
			switch(menu){
				case 1:
					System.out.printf("�ֹ��Ͻ� �Ƹ޸�ī�� ���Խ��ϴ�.\n"); break;
				case 2:
					System.out.printf("�ֹ��Ͻ� ī��� ���Խ��ϴ�.\n"); break;
				case 3:
					System.out.printf("�ֹ��Ͻ� īǪġ�� ���Խ��ϴ�.\n"); break;
				case 4:
					System.out.printf("�ȳ��� ���ʽÿ�.\n"); break;
				default:
					System.out.printf("�߸� �ֹ��ϼ̽��ϴ�.\n"); break;
			}
		}while(menu != 4);
	}
}
