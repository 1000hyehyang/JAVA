import java.util.Scanner;
public class Ext08_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hap = 0;
		int i;
		int num1, num2, num3;
		
		System.out.printf(" ���۰� �Է� : ");
		num1 = sc.nextInt();
		System.out.printf(" ���� �Է� : ");
		num2 = sc.nextInt();
		System.out.printf(" ������ �Է� : ");
		num3 = sc.nextInt();
		
		i = num1;
		
		while(i<=num2) {
			hap = hap+i;
			i += num3;
		}
		System.out.printf("%d���� %d���� %d�� ������ ���� ��: %d \n", num1, num2, num3, hap);
	}

}
