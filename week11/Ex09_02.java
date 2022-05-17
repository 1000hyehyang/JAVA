import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aa[] = new int[4];
		int hap = 0, i;
		
		for(i=0; i<=3; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
			aa[i] = sc.nextInt();
			hap = hap + aa[i];
		}
		
		System.out.printf("합계 ==> %d \n", hap);
	}

}
