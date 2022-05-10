import java.util.Scanner;
public class Ext08_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hap = 0;
		int i;
		int num1, num2, num3;
		
		System.out.printf(" 시작값 입력 : ");
		num1 = sc.nextInt();
		System.out.printf(" 끝값 입력 : ");
		num2 = sc.nextInt();
		System.out.printf(" 증가값 입력 : ");
		num3 = sc.nextInt();
		
		i = num1;
		
		while(i<=num2) {
			hap = hap+i;
			i += num3;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합: %d \n", num1, num2, num3, hap);
	}

}
