import java.util.Scanner;
public class Ex11_02 {

		static int calc(int a, int b, int op) {
			int result;
			
			switch(op) {
			case 1: result = a+b; break;
			case 2: result = a-b; break;
			case 3: result = a*b; break;
			case 4: result = a/b; break;
			default: result = 0;
			}
			return result;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int res;
			int oper, a, b;
			
			System.out.printf("계산 입력 (1: +, 2: -, 3: *, 4: /, args) : ");
			oper = sc.nextInt();
			
			System.out.printf("첫 번째 숫자를 입력: ");
			a = sc.nextInt();
			System.out.printf("두 번째 숫자를 입력: ");
			b = sc.nextInt();
			
			res = calc(a, b, oper);
			
			System.out.printf("계산 결과는 : %d\n", res);
		}
	}
