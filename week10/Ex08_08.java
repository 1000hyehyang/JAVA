import java.util.Scanner;

public class Ex08_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.printf("���� ù ��° �� �Է�: ");
			a = sc.nextInt();
			System.out.printf("���� �� ��° �� �Է�: ");
			b = sc.nextInt();
			
			if(a==0)
				break;
			
			System.out.printf("%d + %d = %d \n", a, b, a+b);
		}
		System.out.printf("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.");

	}

}
