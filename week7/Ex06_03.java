import java.util.Scanner;
public class Ex06_03 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int a;
		
		System.out.printf("������ �Է��ϼ���:");
		a = s.nextInt();
		
		if(a%2 == 0) {
			System.out.printf("¦���� �Է��߽��ϴ�\n");
		}else {
			System.out.printf("Ȧ���� �Է��߽��ϴ�\n");		
		}
	}

}
