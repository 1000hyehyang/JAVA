import java.io.IOException;
import java.util.Scanner;

public class Ex08_04 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		
		while(true) {
			System.out.printf("����� ù ��° ��: ");
			a = sc.nextInt();
			System.out.printf("����� �� ��° ��: ");
			b = sc.nextInt();
			System.out.printf("����� ������ �Է�: ");
			ch = (char)System.in.read();
			
			switch(ch) {
				case'+':
					System.out.printf("%d + %d = %d\n",a, b, a+b); break;
				case'-':
					System.out.printf("%d - %d = %d\n",a, b, a-b); break;
				case'*':
					System.out.printf("%d * %d = %d\n",a, b, a*b); break;
				case'/':
					System.out.printf("%d / %d = %d\n",a, b, a/b); break;
				case'%':
					System.out.printf("%d %% %d = %d\n",a, b, a%b); break;
				default:
					System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�."); break;
			}
		}
	}

}
