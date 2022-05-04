import java.util.Scanner;

public class Ex06_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("1~4 중에 선택하세요: ");
		a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.printf("1을 선택하셨습니다\n");
		break;
		case 2:
			System.out.printf("2를 선택하셨습니다\n");
		break;
		case 3: 
			System.out.printf("3을 선택하셨습니다\n");
			break;
		case 4:
			System.out.printf("4를 선택하셨습니다\b");
			break;
			default:
				System.out.printf("시키지도 않은 것을 선택했군\n");
			
		}

	}

}
