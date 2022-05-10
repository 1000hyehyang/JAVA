import java.io.IOException;
import java.util.Scanner;

public class Ex08_04 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		
		while(true) {
			System.out.printf("계산할 첫 번째 수: ");
			a = sc.nextInt();
			System.out.printf("계산할 두 번째 수: ");
			b = sc.nextInt();
			System.out.printf("계산할 연산자 입력: ");
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
					System.out.printf("연산자를 잘못 입력했습니다."); break;
			}
		}
	}

}
