import java.util.Scanner;
public class Ex08_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.printf("더할 첫 번째 수 입력: ");
			a = sc.nextInt();
			System.out.printf("더할 두 번째 수 입력: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d \n", a, b, a+b);
		}

	}

}
